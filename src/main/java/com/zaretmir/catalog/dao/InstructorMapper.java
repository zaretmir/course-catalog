package com.zaretmir.catalog.dao;

import com.zaretmir.catalog.models.Instructor;
import com.zaretmir.catalog.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InstructorMapper {

    public List<Instructor> getAll() {
        SqlSession session = MyBatisUtil.getSessionFactory().openSession();
        List<Instructor> instructors = session.selectList("getAllInstructors");
        session.commit();
        session.close();
        return instructors;
    }
}
