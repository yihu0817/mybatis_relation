package com.ittx.mybatis.demo1.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ittx.mybatis.demo1.model.Order;
import com.ittx.mybatis.demo1.model.Person;

@Transactional
@Repository("orderDao")
public interface OrderDao {

	public Order selectOrderById(String id);

	public Person selectPersonById(String id);
	
}
