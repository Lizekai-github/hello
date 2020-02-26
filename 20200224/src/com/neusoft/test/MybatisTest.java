package com.neusoft.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTest {


public static void main(String[] args) {
	// 1. ����SqlSessionFactoryBuilder����
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

		// 2. ����SqlMapConfig.xml�����ļ�
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream("congif/SqlMapConfig.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3. ����SqlSessionFactory����
		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
			
		// 4. ����SqlSession����
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// 5. ִ��SqlSession����ִ�в�ѯ����ȡ���User
		// ��һ��������User.xml��statement��id���ڶ���������ִ��sql��Ҫ�Ĳ�����
		Object user = sqlSession.selectOne("queryUserById", 1);
		
		// 6. ��ӡ���
		System.out.println(user);
		
		// 7. �ͷ���Դ
		sqlSession.close();
}
}