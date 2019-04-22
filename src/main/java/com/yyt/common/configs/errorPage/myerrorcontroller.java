package com.yyt.common.configs.errorPage;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * @author ybt
 * 实现后此类后覆盖映射为"/error"的视图解析为404页面就行了
 * 
 */
//@Controller
public class myerrorcontroller implements ErrorController {
	
	@RequestMapping(value="/error",method=RequestMethod.GET)
	public String errorpage404() {
		System.out.println("自定义错误页面..");
		return "forward:error/404.html";
	}
	
	
	@Override
	public String getErrorPath() {
		return "";
	}
}
