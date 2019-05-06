package com.pxg.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/** @ProjectName：JpaAndSpring
 * @ClassName: JpaUnil
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年5月6日上午10:44:35
 */

public class JpaUnil {

	//实体工厂管理
	private static EntityManagerFactory entityManagerFactory;
	//实体对象管理
	private static EntityManager entityManager;
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("JpaAndSpring");
	}
	
	/**
	 * @Title: getEntityManager
	 * @Description: TODO(返回实体管理)
	 * @param  @return   参数
	 * @return EntityManager 返回类型
	 */
	public EntityManager getEntityManager() {
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	/**
	 * @Title: cloneEntiry
	 * @Description: TODO(关闭管理连接)
	 * @param     参数
	 * @return void 返回类型
	 */
	public void closeEntiry() {
		if(entityManager!=null) {
			entityManager.close();
		}
		if (entityManagerFactory!=null) {
			entityManagerFactory.close();
		}
	}
	
}
