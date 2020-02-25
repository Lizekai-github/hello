package com.neusoft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neusoft.entity.User;
import com.neusoft.util.DBUtils;

/**
 * �û�dao��ʵ����
 * @author Neuedu
 * @Date 2020/02/24
 */
public class UserDaoImpl implements UserDao {

	@Override
	public int addOneUser(User user) {
		Connection connection = DBUtils.getConnection();
		String sql = "INSERT INTO user(username,password,regdate) VALUES (?,?,NOW())";
		PreparedStatement prepareStatement = null;
		try {
			//  Ԥ����sql���
		   prepareStatement = connection.prepareStatement(sql);
		    // ��ռλ����ֵ
		   prepareStatement.setString(1, user.getUserName());
		   prepareStatement.setString(2, user.getPassWord());
		    // ִ��sql
		   int executeUpdate = prepareStatement.executeUpdate();
		   return executeUpdate;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(null, prepareStatement, connection);
		}
		return 0;
	}

	@Override
	public boolean checkUserIsExists(User user) {
		Connection connection = DBUtils.getConnection();
		String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
		PreparedStatement prepareStatement = null;
		try {
			//  Ԥ����sql���
		   prepareStatement = connection.prepareStatement(sql);
		    // ��ռλ����ֵ
		   prepareStatement.setString(1, user.getUserName());
		   prepareStatement.setString(2, user.getPassWord());
		    // ִ��sql
		   ResultSet rs = prepareStatement.executeQuery();
		   // ��������
		   System.out.println("�����:"+rs);
		   if(rs.next()) {
			   return true;
		   }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(null, prepareStatement, connection);
		}
		return false;
	}
}