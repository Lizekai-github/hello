package com.neusoft.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neusoft.entity.User;

public class MyBatisTest {

	public static void main(String[] args) throws IOException {
		// ����sqlSessionFactoryBuilder
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		InputStream resourceAsStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
		// sqlSessionFactoryBuilder+SqlMapConfig.xml ����SqlSessionFactory
		SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
		// ����SqlSeesion
		SqlSession ss = build.openSession();
		List<User> users = ss.selectList("selectAllUser");
		System.out.println(users);
		ss.close();
	}
}


