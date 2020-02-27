package com.neusoft.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisTest {

	
	public static SqlSessionFactory getSqlSessionFac() throws IOException {
		
		return null;
	}
	
	public static void main(String[] args) throws IOException {
		// ����sqlSessionFactoryBuilder
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		InputStream resourceAsStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
		// sqlSessionFactoryBuilder+SqlMapConfig.xml ����SqlSessionFactory
		SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
		SqlSession openSession = build.openSession();
		
		// ���sql���
//		User user = new User(null, "����", "123456", null);
//		int insert = openSession.insert("addOneUser", user);
//		openSession.commit();
//		System.out.println(insert);
		
		
		// �޸�
//		User user = new User(6, "���ǳ�", "123456", null);
//		int update = openSession.update("UpdateOneUser", user);
//		openSession.commit();
//		System.out.println(update);
		
		
		// ɾ��
		int delete = openSession.delete("deleteUser", 6);
		openSession.commit();
		System.out.println(delete);
	}
}