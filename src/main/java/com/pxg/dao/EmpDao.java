package com.pxg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pxg.model.Emp;

/** @ProjectName：JpaAndSpring
 * @ClassName: EmpDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年5月6日上午9:45:07
 */

public interface EmpDao extends CrudRepository<Emp, Long>{

	/**
	 * @Title: findEmpCount
	 * @Description: TODO(原生sql，查询数据总数)
	 * @param  @return   参数
	 * @return Integer 返回类型
	 */
	@Query(value = "select count(1) from Dmp",nativeQuery = true)
	public Integer findEmpCount();
}
