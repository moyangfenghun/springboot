package com.yyt.weixinchengxu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(value="视图控制器")
public class indexController {
	
	//组合使用是“或”的关系
	//produces= {"text/html", "application/json"}
	
	
	@RequestMapping(value="/weixinCX",method=RequestMethod.GET)
	@ApiOperation(value = "微信小程序首页", notes = "")
	public String weixinIndexWelcome(@RequestParam String iString) {
		System.out.println("跳转视图....");
		return "weixinCX/index";
	}
	
	/**
	 * 模板使用...
	 */
	@RequestMapping(value="/temp",method=RequestMethod.GET)
	public String temp() {
		return "error/500";
	}
	
}
