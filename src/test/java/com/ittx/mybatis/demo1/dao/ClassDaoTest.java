package com.ittx.mybatis.demo1.dao;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ittx.mybatis.demo1.UserDaoTest;
import com.ittx.mybatis.demo1.model.Classes;
import com.ittx.mybatis.demo1.model.Teacher;

public class ClassDaoTest {
	private static final Logger log = Logger.getLogger(UserDaoTest.class);
	private ClassDao classDao;

	@Before
	public void before() throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		classDao = (ClassDao) ctx.getBean("classDao");
	}
	@Test
	public void testGetClass() {
		Classes classes = classDao.getClass(1);
		log.info(classes);
	}
	
	@Test
	public void testGetClass2() {
		Classes classes = classDao.getClass2(1);
		log.info(classes);
	}
	
	
	@Test
	public void testGetTeacher() {
		Teacher teacher = classDao.getTeacher(1);
		log.info(teacher);
	}
}
