package com.neusoft.oop3;

import java.lang.reflect.Method;

public final class FinalDemo {

	// final���ε������������� ��ַ���ɱ� ���������ǿɱ��
	final int[] A;
	
	public FinalDemo() {
		A = new int[] {1,2,3,4,5};
		
	}
	
	public final void method() {
		System.out.println("�����final����");
	}
	
	
	
	public static void main(String[] args) {
//		A[1] = {5,6,7};
//		System.out.println(Arrays.toString(A));
	}
}