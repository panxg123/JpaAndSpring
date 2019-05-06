package com.pxg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxg.dao.DeptDao;
import com.pxg.model.Dept;
import com.pxg.service.DeptService;

/** @ProjectName��JpaAndSpring
 * @ClassName: DeptServiceImpl
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��5��6������9:57:00
 */

@Service(value = "DeptServiceImpl")
@Transactional(rollbackFor = Exception.class)
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	DeptDao deptDao;

	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

		
	 /** (�� Javadoc)
	 * @return
	 * @see com.pxg.service.DeptService#findAll()
	 */
	    
	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return (List<Dept>) deptDao.findAll();
	}

		
	 /** (�� Javadoc)
	 * @param id
	 * @return
	 * @see com.pxg.service.DeptService#findOne(java.lang.Long)
	 */
	    
	@Override
	public Dept findOne(Long id) {
		// TODO Auto-generated method stub
		return deptDao.findOne(id);
	}


		
	 /** (�� Javadoc)
	 * @param name
	 * @return
	 * @see com.pxg.service.DeptService#findByNameFuzzy(java.lang.String)
	 */
	    
	@Override
	public List<Dept> findByNameFuzzy(String name) {
		// TODO Auto-generated method stub
		return deptDao.findByDnameLike(name);
	}
}
