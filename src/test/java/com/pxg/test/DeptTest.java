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
 * @ProjectName��JpaAndSpring
 * @ClassName: DeptTest
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS���������� @date��2019��5��6������10:11:19
 */

public class DeptTest {

	private DeptService deptService;

	/**
	 * @Title: openContext
	 * @Description: TODO(���������ļ�)
	 * @param     ����
	 * @return void ��������
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
