package com.pxg.service;

import java.util.List;

import com.pxg.dao.DeptDao;
import com.pxg.model.Dept;

/** @ProjectName��JpaAndSpring
 * @ClassName: DeptService
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��5��6������9:55:25
 */

public interface DeptService {

	public List<Dept> findAll();
	
	public Dept findOne(Long id);
	
	public List<Dept> findByNameFuzzy(String name);
}
