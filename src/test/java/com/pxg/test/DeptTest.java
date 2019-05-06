package com.pxg.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pxg.model.Dept;
import com.pxg.service.DeptService;

/**
 * @ProjectName：JpaAndSpring
 * @ClassName: DeptTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生） @date：2019年5月6日上午10:11:19
 */

public class DeptTest {

	private DeptService deptService;

	/**
	 * @Title: openContext
	 * @Description: TODO(加载配置文件)
	 * @param     参数
	 * @return void 返回类型
	 */
	@Before
	public void openContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		deptService =  (DeptService) context.getBean("DeptServiceImpl");
	}

	@After
	public void closeDeptService() {
		deptService = null;
	}

	@Test
	public void findAll() {
		List<Dept> list = deptService.findAll();
		for (Dept dept : list) {
			System.out.println(dept.toString());
		}
	}

	@Test
	public void findOne() {
		Dept dept = deptService.findOne(10L);
		System.out.println(dept.toString());
	}
	
	@Test
	public void findByNameFuzzy() {
		List<Dept> list = deptService.findByNameFuzzy("%M%");
		for (Dept dept : list) {
			System.out.println(dept.toString());
		}
	}
}
