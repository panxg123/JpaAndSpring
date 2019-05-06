package com.pxg.service;

import java.util.List;

import com.pxg.model.Emp;

/** @ProjectName：JpaAndSpring
 * @ClassName: EmpService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年5月6日上午9:55:54
 */

public interface EmpService {

	public List<Emp> findAll();
	
	public Integer findEmpCount();
}
