package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.User;

public interface UserDao {

	// �������
	int addOneUser(User user);
	
	// �ж��û��Ƿ����
	boolean checkUserIsExists(User user);
	
	// ��ѯ�����û�
	List<User> queryAllUser();
	
}