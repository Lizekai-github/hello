package com.neusoft.dao3;

import java.util.List;

import com.neusoft.entity.QueryVo;
import com.neusoft.entity.Student;

public interface StudentDao {

	
	List<Student> getAllStu();
	
	
	// ����ѧ����ѯѧ��
	List<Student> queryStuByStuName(QueryVo qv);
	
	
	// ����name��age��ѯѧ��
	List<Student> queryStuByNameAndAge(Student student);
	
} 