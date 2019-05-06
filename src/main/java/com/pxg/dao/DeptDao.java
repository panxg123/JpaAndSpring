package com.pxg.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pxg.model.Dept;

/** @ProjectName��JpaAndSpring
 * @ClassName: DeptDao
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��5��6������9:43:57
 */

public interface DeptDao extends CrudRepository<Dept, Long>{
	
	/**
	 * @Title: findByDnameLike
	 * @Description: TODO(������������Like��ѯ)
	 * @param  @param name
	 * @param  @return   ����
	 * @return List<Dept> ��������
	 */
	public List<Dept> findByDnameLike(String name);
	
}
