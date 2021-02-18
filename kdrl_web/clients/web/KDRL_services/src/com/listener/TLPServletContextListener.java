package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class TLPServletContextListener implements ServletContextListener {

	@SuppressWarnings("unused")
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		WebApplicationContext rootContext = WebApplicationContextUtils
				.getWebApplicationContext(sce.getServletContext());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {		
	}
}