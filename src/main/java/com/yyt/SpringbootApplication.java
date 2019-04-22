package com.yyt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


//@EnableTransactionManagement开启事务管理
//@EnableAutoConfiguration 自动配置
//@ComponentScan 会自动扫描包路径下面的所有@Controller、@Service、@Repository、@Component 的类
//1、@Configuration声明当前类是一个配置类，相当于一个Spring配置的xml文件 
//2、@Bean注解在方法上，声明当前方法的返回值为一个Bean。
//@ImportResource(locations= {"classpath:application-bean.xml"})配置文件

@SpringBootApplication(scanBasePackages= {"com.yyt.*"})
@MapperScan(basePackages= {"com.yyt.*.dao"})
@EnableAutoConfiguration
@ServletComponentScan// 扫描使用注解方式的servlet  
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
