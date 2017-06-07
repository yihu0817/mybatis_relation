package com.ittx.mybatis.demo1;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ittx.mybatis.demo1.dao.OrderDao;
import com.ittx.mybatis.demo1.model.Order;
import com.ittx.mybatis.demo1.model.Person;

public class UserDaoTest {
	private static final Logger log = Logger.getLogger(UserDaoTest.class);
	private OrderDao orderDao;

	@Before
	public void before() throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		orderDao = (OrderDao) ctx.getBean("orderDao");
	}

	@Test
	public void testSelectUserByID() {
		Order order = orderDao.selectOrderById("O_00001");
		log.info(order);
		Person person = order.getPerson();
		log.info(person);
	}
	
	@Test
	public void testSelectPersonById(){
		Person person = orderDao.selectPersonById("001");
		log.info(person);
		List<Order> orders = person.getOrders();
		for(Order order : orders){
			log.info(order);
		}
	}


}
