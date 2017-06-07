package com.ittx.mybatis.demo1.dao;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ittx.mybatis.demo1.UserDaoTest;
import com.ittx.mybatis.demo1.model.CoursesBean;

public class CoursesDaoTest {

	private static final Logger log = Logger.getLogger(UserDaoTest.class);
	private CoursesDao coursesDao;

	@Before
	public void before() throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		coursesDao = (CoursesDao) ctx.getBean("coursesDao");
	}

	@Test
	public void testFindCouById() {
		CoursesBean coursesBean = coursesDao.findCouById(1);
		log.info(coursesBean);
	}

	@Test
	public void testFindCouAndStu() {
		CoursesBean coursesBean = coursesDao.findCouAndStu(1);
		log.info(coursesBean);
	}

}
