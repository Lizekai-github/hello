package com.neusoft.test;

import java.util.Scanner;

public class Test4 {

	
	// ģ���¼ҵ��
    // ��Ҫ�û���������
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    System.out.println("���������֣�1-7��");
	        String level = "";
	        int day = scanner.nextInt();
	        switch ( 7 - day  ) {
	        case 6:
	          level = "����һ";
	          break;
	        case 5:
	          level = "���ڶ�";
	          break;
	        case 4:
	          level = "������";
	          break;
	        case 3:
	          level = "������";
	          break;
	        case 2:
	          level = "������";
	          break;
	        case 1:
	          level = "������";
	          break;
	        case 0:
	          level = "������";
	          break;
	        default:
	          level = "��������";
	        }
	        System.out.println(level);
	  }
		
		// ���ݿ��д�ŵ��û���������
//		String userName = "helloworld";
//		String passWord = "123456";
//		System.out.println("��ӭ���봸�ӹ���");
//		System.out.println("===========================================");
//		System.out.println("�����������û���:");
//		Scanner scanner = new Scanner(System.in);
//		String name = scanner.next();
//		System.out.println("��������������:");
//		String psw = scanner.next();
//		// �ж��û����������Ƿ���ȷ
//		if(userName.equals(name) && passWord.equals(psw)) {
//			System.out.println("��¼�ɹ�...");
//		}else {
//			System.out.println("�û���������������...");
//		}
		
		
		
		
		
		
//		int a = 5;
//		System.out.println(a>=10);
		
		
		
		// ע�Ϳ�ݼ� Ctrl+/
		// ��Ŀ�����
//		int age = 20;
//		System.out.println(age>=18?"����":"δ����");
		
		
		
		// ��ҳ
		//    2     10         5
		//    3     11         5
		// ҳ��  ���������� ÿҳ���ݴ�С
//		int total = 50;
//		int pageSize = 5;
//		int pages = total % pageSize == 0 ? total /pageSize : total/pageSize +1;
//		System.out.println(pages);
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("������һ����:");
//		int num = scanner.nextInt();
//		if(num > 0) {
//			System.out.println("������");
//		}else if(num < 0) {
//			System.out.println("������");
//		}else {
//			System.out.println("0");
//		}
		
		// �жϷ��������в�
		
		// �ж����ڼ�
		// ֻ��������1-7 �߸�����
		// �������<1 ���� >7���� ��� �������� �˳�����
		// ���� �����Ӧ�� ����  ���� 1 ---> ����һ ,2----> ���ڶ� 
		// ʹ��switch....case��
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("��������ķ���:(0-100)");
//		String level = "";
//		int score = scanner.nextInt();
//		//      byte shot int char String
//		switch (score / 10) {
//		case 10:
//			level = "����";
//			break;
//			// ��͸
//		case 9:
//			level = "����";
//			break;
//		case 8:
//			level = "����";
////			break;
//		case 7:
//			level = "�е�";
//			break;
//		case 6:
//			level = "����";
//			break;
//		default:
//			level = "������";
//			break;
//		}
//		System.out.println("���ĳɼ��ȼ�Ϊ:"+level);
}