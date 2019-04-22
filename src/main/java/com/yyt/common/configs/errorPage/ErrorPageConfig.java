package com.yyt.common.configs.errorPage;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;


/**
 * 这个配置打包成war时不可用
 * 有拦截器的情况下，只有404.html不会被拦截。
 * 不拦截的情况下，定义的静态资源路径不会被拦截
 */
//@Configuration
public class ErrorPageConfig {

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {
		return new EmbeddedServletContainerCustomizer() {

			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				//此处填写的路劲可以时控制器的也可以是静态态资源路劲，最后以传发的形式访问
				ErrorPage error400Page = new ErrorPage(HttpStatus.BAD_REQUEST, "/error/400.html");
				ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/error/401.html");
				ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/error/404.html");
				ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error/500.html");

				container.addErrorPages(error400Page, error401Page, error404Page, error500Page);
			}
		};
	}
}
