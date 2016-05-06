package com.pu.filecontroller.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.pu.filecontroller.utils.PropsUtil;

public class Activator implements BundleActivator {

	/**
	 * osgi start
	 */
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello World!!");
		PropsUtil.loadProps("T.properties");
	}
	
	/**
	 * osgi stop
	 * 
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
	}

}
