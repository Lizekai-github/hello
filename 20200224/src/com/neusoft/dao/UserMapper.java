package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.User;

public interface UserMapper {

	// �������
	int addOneUser(User user);
	
	// �ж��û��Ƿ����
	boolean checkUserIsExists(User user);
	
	// ��ѯ�����û�
	List<User> queryAllUser();
	
	// ɾ���û�
	int deleteUserById(int id);
	
	// �ж��û����Ƿ����
	boolean checkUserNameIsExists(String userName);
	
}