package com.zaretmir.catalog.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisUtil {

    private static SqlSessionFactory sessionFactory;

    static {
        Reader reader;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static SqlSessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
