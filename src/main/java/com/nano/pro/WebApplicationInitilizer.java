package com.nano.pro;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebApplicationInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {

System.out.println("getRootConfigClasses()");		
return new Class[] {ConfigurationFile.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses()");		
		return new Class[] {ConfigurationFile.class};
	}

	@Override
	protected String[] getServletMappings() {
System.out.println("getServletMappings()");
		return new String[] {"/"};
	}

	
	
}
