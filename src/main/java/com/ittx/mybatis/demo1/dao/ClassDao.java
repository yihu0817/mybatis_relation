package com.ittx.mybatis.demo1.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ittx.mybatis.demo1.model.Classes;
import com.ittx.mybatis.demo1.model.Teacher;

@Transactional
@Repository("classDao")
public interface ClassDao {
	public Classes getClass(int id);
	
	public Classes getClass2(int id);
	
	public Teacher getTeacher(int id);
	
	
}
