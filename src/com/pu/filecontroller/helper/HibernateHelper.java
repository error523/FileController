package com.pu.filecontroller.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.pu.filecontroller.bean.FileTableBean;
import com.pu.filecontroller.config.LocalConfiguration;
import com.pu.filecontroller.utils.PropsUtil;

public class HibernateHelper {
	private static final SessionFactory sessionFactory;
	static {
		try {
			// Create the SessionFactory from standard (hibernate.cfg.xml)
			// config file.
			// passby method new
			// AnnotationConfiguration().configure().buildSessionFactory();
			sessionFactory = getHibernateConfig().configure()
					.buildSessionFactory();
		} catch (Throwable ex) {
			// Log the exception.
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static Configuration getHibernateConfig() {
		Configuration cfg = new Configuration();
		// 获取properties文件中的数据
		cfg.setProperties(LocalConfiguration.getComProps());
		cfg.addResource("FileTable.hbm.xml",Thread.currentThread().getContextClassLoader());
		cfg.addClass(FileTableBean.class);
		return cfg;
	}
}
