package com.pxg.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.pxg.model.Dept;

/** @ProjectName：JpaAndSpring
 * @ClassName: DeptDaoImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年5月6日上午10:02:49
 */
@Repository(value = "DeptDaoImpl")
public class DeptDaoImpl {

	 
	public Iterable<Dept> findAll() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaAndSpring");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.createQuery("select d from Dept d").getResultList();
	}


}
