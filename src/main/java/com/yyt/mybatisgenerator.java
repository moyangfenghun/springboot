package com.yyt;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class mybatisgenerator {
	//根据配置文件逆向生成mapper和dao,bean
	public static void main(String[] args) throws Exception {
		
		List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		   File configFile = new File("src/main/resources/mybatis/generatorConfig.xml");
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   myBatisGenerator.generate(null);
	}
}
