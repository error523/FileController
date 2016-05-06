package com.pu.filecontroller.config;

import java.util.Properties;

import com.pu.filecontroller.utils.PropsUtil;

public class LocalConfiguration {
	public static final String PROPERTIESFILE = "commons.properties";
	
	private static final ThreadLocal<Properties> PROPERTIES_THREAD_LOCAL;
	static {
		PROPERTIES_THREAD_LOCAL = new ThreadLocal<Properties>();
	}
	
	public static Properties getComProps(){
		Properties props = PROPERTIES_THREAD_LOCAL.get();
		if(null==props){
			PROPERTIES_THREAD_LOCAL.set(PropsUtil.loadProps(LocalConfiguration.PROPERTIESFILE));
		}
		return props;
	}
}
