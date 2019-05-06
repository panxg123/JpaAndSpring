package com.pxg.service;

import java.util.List;

import com.pxg.dao.DeptDao;
import com.pxg.model.Dept;

/** @ProjectName：JpaAndSpring
 * @ClassName: DeptService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年5月6日上午9:55:25
 */

public interface DeptService {

	public List<Dept> findAll();
	
	public Dept findOne(Long id);
	
	public List<Dept> findByNameFuzzy(String name);
}
