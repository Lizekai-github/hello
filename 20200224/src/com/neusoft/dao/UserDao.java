package com.neusoft.dao;

import com.neusoft.entity.User;

public interface UserDao {

	// �������
	int addOneUser(User user);
	
	// �ж��û��Ƿ����
	boolean checkUserIsExists(User user);
	
}