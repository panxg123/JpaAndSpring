package com.pxg.service;

import java.util.List;

import com.pxg.model.Emp;

/** @ProjectName��JpaAndSpring
 * @ClassName: EmpService
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��5��6������9:55:54
 */

public interface EmpService {

	public List<Emp> findAll();
	
	public Integer findEmpCount();
}
