package com.neusoft.studentManager;

import java.util.List;
import java.util.Scanner;

public class Client {
	

	
	
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
		System.out.print("�����ѡ����Ϣ���(���֮����-�ָ�):");
		List<Course> courses = School.courses;
		for(Course c:courses) {
			System.out.print("�γ̱��:"+c.getcId()+",�γ���:"+c.getCourseName());
		}
		System.out.println();
		String cNum = scanner.next();
		// 50-51-52    ѧ�����ѡ����Ϣ
		String[] split = cNum.split("-");
		
		
	}
	
	public void studentInfoManager() {
		System.out.println("��ӭ����ѧ����Ϣ�������");
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
			
			break;

		default:
			System.err.println("��������.����������");
			studentInfoManager();
			break;
		}
	}

	public void launchFrame() {
		System.out.println("��ӭ����xxxѧ������ϵͳ");
		System.out.println("1.ѧ����Ϣ����");
		System.out.println("2.�γ���Ϣ����");
		System.out.println("3.��ѯѧ��ѡ�����");
		System.out.println("4.��ѯ�γ̱�ѡ���");
		System.out.println("5.ѧ�����ѡ��");
		System.out.println("6.ѧ��ɾ��ѡ��");
		System.out.println("��������Ҫ�����Ĺ���:����(1-6)");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			break;
		default:
			System.out.println("�Ƿ�����,����������");
			launchFrame();
			break;
		}
	}
}