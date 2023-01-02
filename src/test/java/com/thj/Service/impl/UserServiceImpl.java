package com.thj.Service.impl;

import com.thj.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class UserServiceImpl {
    @Test
    public void findById() throws Exception{
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sqlSessionFactory.openSession();
        User user = session.selectOne("com.thj.Service.impl.UserServiceImpl.userById",1);
        System.out.println(user);
        session.close();
    }
}
