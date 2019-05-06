package com.pxg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxg.dao.EmpDao;
import com.pxg.model.Emp;
import com.pxg.service.EmpService;

/** @ProjectName��JpaAndSpring
 * @ClassName: EmpServiceImpl
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��5��6������9:58:30
 */
@Service(value = "EmpServiceImpl")
@Transactional(rollbackFor = Exception.class)
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpDao empDao;

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

		
	 /** (�� Javadoc)
	 * @return
	 * @see com.pxg.service.EmpService#findAll()
	 */
	    
	@Override
	public List<Emp> findAll() {
		
		return (List<Emp>) empDao.findAll();
	}


		
	 /** (�� Javadoc)
	 * @return
	 * @see com.pxg.service.EmpService#findEmpCount()
	 */
	    
	@Override
	public Integer findEmpCount() {
		// TODO Auto-generated method stub
		return empDao.findEmpCount();
	}
}
