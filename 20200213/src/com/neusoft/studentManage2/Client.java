package com.neusoft.studentManage2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
	

	public static void main(String[] args) {
		new Client().launchFrame();
	}
	
	public void queryStudent() {
		System.out.println("��ӭ������ѯѧ��ҳ��");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ��ѧ������");
		String name = scanner.next();
		boolean flag = false;
		for(int i=0;i<School.students.size();i++) {
			Student student = School.students.get(i);
			if(student.getStuName().equals(name)) {
				flag = true;
				System.out.println("��ѯ����ѧ����ϢΪ:"+student);
			}
		}
		if(flag == false) {
			System.out.println("û�в�ѯ��ѧ����Ϣ...");
		}
		studentInfoManager();
	}
	
	public void deleteStudent() {
		System.out.println("��ӭ�����޸�ѧ��ҳ��");
		System.out.println("����ѧ����Ϣ:"+School.students);
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫɾ��ѧ����ѧ��");
		int sId = scanner.nextInt();
		for(int i=0;i<School.students.size();i++) {
			Student student = School.students.get(i);
			if(student.getsId() == sId) {
				School.students.remove(i);
			}
		}
		System.out.println("ɾ���ɹ�~");
		System.out.println("����ѧ����Ϣ:"+School.students);
		studentInfoManager();
	}
	
	
	public void updateStudent() {
		System.out.println("��ӭ�����޸�ѧ��ҳ��");
		System.out.println("����ѧ����Ϣ:"+School.students);
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������޸�ѧ����ѧ��");
		int sId = scanner.nextInt();
		for(int i=0;i<School.students.size();i++) {
			Student student = School.students.get(i);
			// �ҵ���Ҫ�޸ĵ�ѧ��
			if(student.getsId() == sId) {
				System.out.println("�������޸ĺ������");
				String sName = scanner.next();
				System.out.println("�������޸ĺ���Ա�");
				String sSex = scanner.next();
				System.out.println("�������޸ĺ�ĵ�ַ");
				String sAddRess = scanner.next();
				student.setStuName(sName);
				student.setSex(sSex.charAt(0));
				student.setStuAddress(sAddRess);
			}
		}
		System.out.println("�޸ĳɹ�...");
		System.out.println("ѧ����Ϣ:"+School.students);
		studentInfoManager();
	}
	
	
	
	
	
	public void addStudent() {
		System.out.println("��ӭ��������ѧ��ҳ��");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ����ѧ��");
		int sId = scanner.nextInt();
		System.out.println("������ѧ��������");
		String sName = scanner.next();
		System.out.println("������ѧ�����Ա�");
		String sSex = scanner.next();
		System.out.println("������ѧ���ĵ�ַ");
		String sAddRess = scanner.next();
		System.out.print("������ѡ����Ϣ���(���֮����-�ָ�):");
		Student student = new Student(sId, sName, sSex.charAt(0), sAddRess, new ArrayList<Integer>());
		// ��ʾ  ������еĿγ̺�
		List<Course> courses = School.courses;
		for(Course c:courses) {
			System.out.print("�γ̱��:"+c.getcId()+",�γ���:"+c.getCourseName());
		}
		String cId = scanner.next();
		String[] split = cId.split("-");
		for (String string : split) {
			student.getcId().add(Integer.parseInt(string));
		}
		// ��ѧ����Ϣ���ӵ�ѧУ��ѧ��������
		School.students.add(student);
		System.err.println("���ӳɹ�");
		studentInfoManager();
	}
	
	public void studentInfoManager() {
		System.out.println("��ӭ����ѧ����Ϣ��������");
		System.out.println("1.����ѧ��");
		System.out.println("2.�޸�ѧ��");
		System.out.println("3.ɾ��ѧ��");
		System.out.println("4.��ѯѧ��");
		System.out.println("5.������һ��");
		System.out.println("������Ҫ�����Ĺ���:(1-6)");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			addStudent();
			break;
		case 2:
			updateStudent();
			break;
		case 3:
			deleteStudent();
			break;
		case 4:
			queryStudent();
			break;
		case 5:
			launchFrame();
			break;
		default:
			System.err.println("��������.����������");
			studentInfoManager();
			break;
		}
	}

	
	public void addCourse() {
		System.out.println("��ӭ�������ӿγ�ҳ��");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������γ�ID");
		int cId = scanner.nextInt();
		System.out.println("������γ���");
		String cName = scanner.next();
		Course course = new Course(cId, cName, new ArrayList<Integer>());
		School.courses.add(course);
		System.out.print("������ѡ��ѧ�����(���֮����-�ָ�):");
		List<Student> students = School.students;
		for(Student s:students) {
			System.out.print("ѧ�����:"+s.getsId()+",ѧ������:"+s.getStuName());
			System.out.println();
		}
		String sNum = scanner.next();
		// 1-2-3-4    �γ�����ѡ�ε�ѧ����Ϣ
		String[] split = sNum.split("-");
		for (String string : split) {
			// �γ�������ѧ��id
			course.getsId().add(Integer.parseInt(string));
			Student queryStuByStuId = queryStuByStuId(Integer.parseInt(string));
			queryStuByStuId.getcId().add(course.getcId());
		}
		System.out.println("���ӿγ���Ϣ�ɹ�~");
		courseInfoManager();
	}
	
	// ����ѧ��id��ѯѧ����Ϣ�ķ���
	public Student queryStuByStuId(Integer stuId) {
		List<Student> stus = School.students;
		for(int i=0;i<stus.size();i++) {
			if(stus.get(i).getsId() == stuId) {
				return stus.get(i);
			}
		}
		return null;
	}
	
	// �޸Ŀγ�
	public void updateCourse() {
		//�޸Ŀγ� 
		System.out.println("������...����Ա�ݼ���...");
		courseInfoManager();
	}
	
	
	// ɾ���γ�
	public void deleteCourse() {
		//ɾ���γ� 
		System.out.println("������...����Ա�ݼ���...");
		courseInfoManager();
	}
	
	/**
	 * �γ���Ϣ����
	 */
	public void courseInfoManager() {
		System.out.println("��ӭ�����γ���Ϣ��������");
		System.out.println("1.���ӿγ�");
		System.out.println("2.�޸Ŀγ�");
		System.out.println("3.ɾ���γ�");
		System.out.println("4.�ص���һ��");
		System.out.println("������Ҫ�����Ĺ���:(1-4)");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			addCourse();
			break;
		case 2:
			updateCourse();
			break;
		case 3:
			deleteCourse();
			break;
		case 4:
			launchFrame();
			break;
		default:
			System.err.println("��������.����������");
			courseInfoManager();
			break;
		}
	}
	
	// ͨ�^�W̖,��ѯѧ��ѡ�����
	public void queryStudentChooseCourse() {
		System.out.println("����ѧ����Ϣ:");
		for(Student s:School.students) {
			System.out.print("ѧ��ID:"+s.getsId()+",ѧ������:"+s.getStuName());
			System.out.println();
		}
		System.out.println("������Ҫ��ѯ��ѧ��ID:");
		Scanner scanner = new Scanner(System.in);
		int sId = scanner.nextInt();
		Student queryStuByStuId = queryStuByStuId(sId);
		List<Integer> getcId = queryStuByStuId.getcId();
		System.out.println("idΪsId��ѧ����ѡ����"+getcId+"�γ�");
		launchFrame();
	}
	
	// ͨ���γ̺ţ���ӡ��ǰ�γ�����ѧ����Ϣ
	public void queryCourseStudentInfo() {
		System.out.println("������...");
		launchFrame();
	}
	// ����ѡ���ſγ̵�ѧ��
	// �����ӿγ���ͬ
	
	// ɾ��ѡ�����ſγ̵�ѧ�� 
	// ��ɾ���γ���ͬ
	
	
	
	public void launchFrame() {
		System.out.println("��ӭ����xxxѧ������ϵͳ");
		System.out.println("1.ѧ����Ϣ����");
		System.out.println("2.�γ���Ϣ����");
		System.out.println("3.��ѯѧ��ѡ�����");
		System.out.println("4.��ѯ�γ̱�ѡ���");
		System.out.println("5.ѧ������ѡ��");
		System.out.println("6.ѧ��ɾ��ѡ��");
		System.out.println("��������Ҫ�����Ĺ���:����(1-6)");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			studentInfoManager();
			break;
		case 2:
			courseInfoManager();
			break;
		case 3:
			queryStudentChooseCourse();
			break;
		default:
			System.out.println("�Ƿ�����,����������");
			launchFrame();
			break;
		}
	}
}