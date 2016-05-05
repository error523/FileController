package com.pu.filecontroller.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	/**
	 * osgi start
	 */
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello World!!");
	}
	
	/**
	 * osgi stop
	 * 
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
	}

}
