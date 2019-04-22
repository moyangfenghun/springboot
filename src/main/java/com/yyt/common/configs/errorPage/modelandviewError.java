package com.yyt.common.configs.errorPage;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

/**
 * 两个只有一个会生效
 * ErrorViewResolver接口实现类
 * ErrorController实现类优先级高
 * 但是两个都必须进过经过拦截器，意味着拦截器要做处理
 * @author ybt
 * 
 */
//@Component
public class modelandviewError implements ErrorViewResolver {

	@Override
	public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
		System.out.println("error2.....");
		return null;
	}

}
