package com.pxg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pxg.model.Emp;

/** @ProjectName��JpaAndSpring
 * @ClassName: EmpDao
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��5��6������9:45:07
 */

public interface EmpDao extends CrudRepository<Emp, Long>{

	/**
	 * @Title: findEmpCount
	 * @Description: TODO(ԭ��sql����ѯ��������)
	 * @param  @return   ����
	 * @return Integer ��������
	 */
	@Query(value = "select count(1) from Dmp",nativeQuery = true)
	public Integer findEmpCount();
}
