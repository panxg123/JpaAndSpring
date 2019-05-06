package com.pxg.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/** @ProjectName��JpaAndSpring
 * @ClassName: JpaUnil
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��5��6������10:44:35
 */

public class JpaUnil {

	//ʵ�幤������
	private static EntityManagerFactory entityManagerFactory;
	//ʵ��������
	private static EntityManager entityManager;
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("JpaAndSpring");
	}
	
	/**
	 * @Title: getEntityManager
	 * @Description: TODO(����ʵ�����)
	 * @param  @return   ����
	 * @return EntityManager ��������
	 */
	public EntityManager getEntityManager() {
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	/**
	 * @Title: cloneEntiry
	 * @Description: TODO(�رչ�������)
	 * @param     ����
	 * @return void ��������
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
