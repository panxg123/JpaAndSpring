package com.pxg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxg.dao.EmpDao;
import com.pxg.model.Emp;
import com.pxg.service.EmpService;

/** @ProjectName：JpaAndSpring
 * @ClassName: EmpServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年5月6日上午9:58:30
 */
@Service(value = "EmpServiceImpl")
@Transactional(rollbackFor = Exception.class)
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpDao empDao;

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

		
	 /** (非 Javadoc)
	 * @return
	 * @see com.pxg.service.EmpService#findAll()
	 */
	    
	@Override
	public List<Emp> findAll() {
		
		return (List<Emp>) empDao.findAll();
	}


		
	 /** (非 Javadoc)
	 * @return
	 * @see com.pxg.service.EmpService#findEmpCount()
	 */
	    
	@Override
	public Integer findEmpCount() {
		// TODO Auto-generated method stub
		return empDao.findEmpCount();
	}
}
