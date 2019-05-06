package com.pxg.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.pxg.model.Dept;

/** @ProjectName��JpaAndSpring
 * @ClassName: DeptDaoImpl
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��5��6������10:02:49
 */
@Repository(value = "DeptDaoImpl")
public class DeptDaoImpl {

	 
	public Iterable<Dept> findAll() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaAndSpring");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.createQuery("select d from Dept d").getResultList();
	}


}
