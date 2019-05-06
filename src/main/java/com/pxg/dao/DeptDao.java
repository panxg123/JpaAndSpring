package com.pxg.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pxg.model.Dept;

/** @ProjectName：JpaAndSpring
 * @ClassName: DeptDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年5月6日上午9:43:57
 */

public interface DeptDao extends CrudRepository<Dept, Long>{
	
	/**
	 * @Title: findByDnameLike
	 * @Description: TODO(根据姓名进行Like查询)
	 * @param  @param name
	 * @param  @return   参数
	 * @return List<Dept> 返回类型
	 */
	public List<Dept> findByDnameLike(String name);
	
}
