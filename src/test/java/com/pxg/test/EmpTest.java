package com.pxg.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pxg.model.Emp;
import com.pxg.service.DeptService;
import com.pxg.service.EmpService;

/** @ProjectName：JpaAndSpring
 * @ClassName: EmpTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年5月6日下午4:31:39
 */

public class EmpTest {

	private EmpService empService;

	/**
	 * @Title: openContext
	 * @Description: TODO(加载配置文件)
	 * @param     参数
	 * @return void 返回类型
	 */
	@Before
	public void openContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		empService =  (EmpService) context.getBean("EmpServiceImpl");
	}

	@After
	public void closeDeptService() {
		empService = null;
	}
	
	@Test
	public void findAll() {
		List<Emp> list = empService.findAll();
		for (Emp emp : list) {
			System.out.println(emp.toString());
		}
	}
	
	@Test 
	public void findEmpCount() {
		System.out.println(empService.findEmpCount());
	}
}
