package com.pu.filecontroller.activator;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.pu.filecontroller.config.LocalConfiguration;
import com.pu.filecontroller.helper.HibernateHelper;
import com.pu.filecontroller.utils.ClassLoaderUtil;

public class Activator implements BundleActivator {
	//日志对象
    private final Logger logger = Logger.getLogger(Activator.class);
	/**
	 * osgi start
	 */
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello World!!");
		init();
	}
	
	/**
	 * osgi stop
	 * 
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
	}

	private void init(){
		Properties props = LocalConfiguration.getComProps();
		ClassLoaderUtil.loadClass(HibernateHelper.class.getName(),true);
//		SessionFactory sessionFactory = HibernateHelper.getSessionFactory();
//		//开启会话
//        Session session  = sessionFactory.openSession();
//        //打开事务
//        Transaction tx = session.beginTransaction();
//        try {
//        	session.createQuery("from com.pu.filecontroller.bean.FileTableBean");
//            tx.commit();
//        } catch (Exception e) {
//            logger.error("数据库初始化失败！"+e.getMessage());
//            //如果异常则回滚事务，下同
//            tx.rollback();
//        }finally{
//            session.close();
//        }
	}
}
