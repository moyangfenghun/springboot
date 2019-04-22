package com.yyt.common.configs.dataSource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class springDataSourceConfig {

	// @Autowired
	//private Environment env;

	private String url;

	private String username;

	private String driverClassName;

	private String password;

	private int initialSize;

	private int minIdle;

	private int maxActive;

	private long maxWait;

	private long timeBetweenEvictionRunsMillis;

	private long minEvictableIdleTimeMillis;

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public String getPassword() {
		return password;
	}

	public int getInitialSize() {
		return initialSize;
	}

	public int getMinIdle() {
		return minIdle;
	}

	public int getMaxActive() {
		return maxActive;
	}

	public long getMaxWait() {
		return maxWait;
	}

	public long getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}

	public long getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}

	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}

	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}

	public void setMaxWait(long maxWait) {
		this.maxWait = maxWait;
	}

	public void setTimeBetweenEvictionRunsMillis(long timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}

	public void setMinEvictableIdleTimeMillis(long minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}

	@Bean(name = "dataSource")
	@Primary // 在同样的DataSource中，首先使用被标注的DataSource
	public DataSource getDataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driverClassName);
		// configuration
		dataSource.setInitialSize(initialSize);
		dataSource.setMinIdle(minIdle);
		dataSource.setMaxActive(maxActive);
		dataSource.setMaxWait(maxWait);
		dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);

		return dataSource;
	}

//	@Bean(name = "dataSource2")
//	@ConfigurationProperties(prefix = "spring.datasource")
//	public DataSource dataSource() {
//		return DataSourceBuilder.create().type(com.alibaba.druid.pool.DruidDataSource.class).build();
//
//	}

}
