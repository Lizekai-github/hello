package com.neusoft.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RunTimeExceptionDemo {
	
	
	// ����
	public void test() throws FileNotFoundException {
		
		// �ܼ��쳣
//		FileReader f3 = new FileReader("E://hello.txt");
	}
	

	public static void main(String[] args) throws FileNotFoundException {
		new RunTimeExceptionDemo().test();
//		System.out.println(1/0);
		
		// �ܼ��쳣
//		try {
//			FileReader f2 = new FileReader("E://hello.txt");
//			String str = "���";
//			Integer.parseInt(str);
//		} catch (FileNotFoundException e) {
//			System.out.println("ԭ��:"+e.getCause());
//		} catch(NumberFormatException e) {
//			System.out.println("fileReader"+e.getCause());
//		} finally {
//			System.out.println("finally");
//		}
		//System.out.println("hello");
	}
}