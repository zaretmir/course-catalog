package com.zaretmir.catalog.dao;

import com.zaretmir.catalog.models.Course;
import com.zaretmir.catalog.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseMapper {

    public List<Course> getAll() {
        SqlSession session = MyBatisUtil.getSessionFactory().openSession();
        List<Course> allCourses = session.selectList("getAllCourses");
        session.commit();
        session.close();
        return allCourses;
    }

    public Course getById() {
        SqlSession session = MyBatisUtil.getSessionFactory().openSession();
        Course course = session.selectOne("getCourse");
        session.commit();
        session.close();
        return course;
    }

    public Course getByIdWithInstructor(Long id) {
        SqlSession session = MyBatisUtil.getSessionFactory().openSession();
        Course course = session.selectOne("getByIdWithInstructor", id);
        session.commit();
        session.close();
        return course;
    }

    // TODO: Cambiar el return type
    public Course add(Course course) {
        SqlSession session = MyBatisUtil.getSessionFactory().openSession();
        session.insert("insert", course);
        session.commit();
        session.close();
        return course;
    }
}
