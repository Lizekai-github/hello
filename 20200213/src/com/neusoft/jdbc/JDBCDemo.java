package com.neusoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo {
	
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			// 1.��������
			Class.forName("com.mysql.jdbc.Driver");
			// 2.��������      Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personmanager?", "root", "mysqladmin");
			// 3.����sql���
			String str = "select * from boys";
			// 4.����sql���
			prepareStatement = connection.prepareStatement(str);
			// 5.ִ��sql���
			resultSet = prepareStatement.executeQuery();
			// 6.ȡ�����
			while(resultSet.next()) {
				// �õ�һ����¼
				int id = resultSet.getInt("id");
				String boyName = resultSet.getString("boyName");
				int cp = resultSet.getInt("userCP");
				System.out.print(id);
				System.out.print(boyName);
				System.out.print(cp);
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				prepareStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}