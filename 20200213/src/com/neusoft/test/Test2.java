package com.neusoft.test;

import java.util.Scanner;

public class Test2 {

	// ������
	public static void main(String[] args) {
		// ����id
		int id;
		// �ַ������� ������Ϊname
		String name = "����";
		// The local variable name may not have been initialized
		System.out.println(name);
		
		int age = 28;
		if(age < 28) {
			int score = 100;
			System.out.println(score);
		}
		// score cannot be resolved to a variable
//		System.out.println(score);
		
		// ��������
		// ����
		// The literal 13241234856854 of type int is out of range 
		long num = 13241234856854L;
		
		// ���뼯:utf-8
		// �ÿռ任ʱ��
		// ����MB  256GB
		// 500MB  1.5GB
		float num2 = 2.0F;
		
		// char
		char c = 'a';
		char d = '��';
		char sex = '��';
		char sex2 = 'Ů';
		
		// ascII���ֵ
		// ��סA a 0 ��ascIIֵ
		char e = 97;
		System.out.println(e);
		
		// unicode
		char f = 20013;
		System.out.println((int)f);
		
		
		// ��������ַ�
		// ��֤��
	    //  bcgh  jklh
		// �������100��0-57������
//		for(int i=0;i<100;i++) {
//			// ����������Ĺ���
//			Random random = new Random();
//			int nextInt = random.nextInt(26);
//			char val  = (char)('A'+nextInt);
//			System.out.println(val);
//		}
		
		
//		boolean meeting = true;
//		if(meeting) {
//			System.out.println("����");
//		}else {
//			System.out.println("�¿�");
//		}
		
		// ���ֻ�����������
		// byte short int long 
		// float double
		// char boolean
		
		// ���տ���̨����
		// java�ϸ����ִ�Сд
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("����������ȡ������");
		// �����յ��������浽nextInt������
//		int nextInt = scanner.nextInt();
//		System.out.println("����ȡ������:"+nextInt);
		
		
		// 1.
		int age1 = 15;
		int age2 = 18;
		System.out.println(age1+age2);
		
		// ���2���� �˽��� ʮ��������
		int oneNum = 19;
		// ������
		System.out.println(Integer.toBinaryString(oneNum));
		// �˽���
		System.out.println(Integer.toOctalString(oneNum));
		// ʮ������
		System.out.println(Integer.toHexString(oneNum));
		
		// 3.
		long one = 12345678901L;
		float two = 3.1415926F;
		double three = 1234567890.0987654321;
		
		// 4.
		
		
		// 5.
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������һ������:");
		int nextInt = scanner.nextInt();
		System.out.println("ƽ��"+(nextInt*nextInt));
		
		// ţ��֯Ů
		double distance = 9460730472580800.0;
		System.out.println("һ����Ҫ"+distance/0.45+"ֻϲȵ");
		
		
		// ��������
		double dis = 2*9.8*384;
		// jdk ����
		System.out.println(Math.sqrt(dis));
		
		
	}
}