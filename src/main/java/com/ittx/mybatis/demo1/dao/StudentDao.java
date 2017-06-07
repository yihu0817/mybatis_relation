package com.ittx.mybatis.demo1.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ittx.mybatis.demo1.model.StudentBean;
@Transactional
@Repository("studentDao")
public interface StudentDao {
    /**
     * 根据id值查询学生信息
     * @param id
     * @return
     */
    public StudentBean findStuById(int id);
    
    /**
     * 要求查询学生时，将学生选择的课程查出
     * @param id
     * @return
     */
    public StudentBean findStuAndCou(int id);

}