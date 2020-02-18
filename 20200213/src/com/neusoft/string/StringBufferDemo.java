package com.neusoft.string;

import java.util.ArrayList;

public class StringBufferDemo {

	
	public static void main(String[] args) {
		// String = final char[] 
		// StringBuffer ---> char[]
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("hello").append("word").append("nihao");
		System.out.println(stringBuffer);
		
//		StringBuffer delete = stringBuffer.delete(1, 5);
//		System.out.println(delete);
		
//		StringBuffer insert = stringBuffer.insert(0, "today");
//		System.out.println(insert);
		
//		StringBuffer replace = stringBuffer.replace(1, 5, "friday");
//		System.out.println(replace);
		
		StringBuffer reverse = stringBuffer.reverse();
		System.out.println(reverse);
	
		
		// stringBuilder�÷���stringBuffer 99%
		// synchronized
		
		StringBuilder stringBuilder = new StringBuilder();
		
		// ����
		// List
		// ����
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Student student = new Student("���¸�", 500, 50, "������");
		arrayList.add(new Student("����", 500, 50, "�Ⱦ�"));
		arrayList.add(student);
		arrayList.add(new Student("��ǫ", 500, 50, "��ͷ"));
		arrayList.add(new Student("�Ϻ���", 500, 50, "�������"));
		arrayList.add(new Student("�ձ�", 500, 50, "���ձ�"));
		System.out.println(arrayList);
		
//		arrayList.remove(student);
		
		System.out.println(arrayList);
		
		arrayList.set(0, new Student("����", 500, 50, "�Ⱦ�"));
		
		System.out.println(arrayList);
		
		
	}
}