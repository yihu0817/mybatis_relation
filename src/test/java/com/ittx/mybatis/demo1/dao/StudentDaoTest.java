package com.ittx.mybatis.demo1.dao;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ittx.mybatis.demo1.UserDaoTest;
import com.ittx.mybatis.demo1.model.StudentBean;

public class StudentDaoTest {

	private static final Logger log = Logger.getLogger(UserDaoTest.class);
	private StudentDao studentDao;

	@Before
	public void before() throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		studentDao = (StudentDao) ctx.getBean("studentDao");
	}

	@Test
	public void testFindStuById() {
		StudentBean studentBean = studentDao.findStuById(1);
		log.info(studentBean);
	}

	@Test
	public void testFindStuAndCou() {
		StudentBean studentBean = studentDao.findStuAndCou(1);
		log.info(studentBean);
	}

}
