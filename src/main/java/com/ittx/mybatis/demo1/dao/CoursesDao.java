package com.ittx.mybatis.demo1.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ittx.mybatis.demo1.model.CoursesBean;

@Transactional
@Repository("coursesDao")
public interface CoursesDao {
    
    /**
     * 根据id查询课程
     * @param id
     * @return
     */
    public CoursesBean findCouById(int id);
    
    /**
     * 要求查课时，将选课的学生一并查出
     * @param id
     * @return
     */
    public CoursesBean findCouAndStu(int id);
}
