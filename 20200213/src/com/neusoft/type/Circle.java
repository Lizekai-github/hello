package com.neusoft.type;

public class Circle extends Shape{

	@Override
	public void shape() {
		System.out.println("Բ��");
	}
	
	// ��̬��������
	// �̳�
	// ����ת��
	// ��д
	public static void main(String[] args) {
		// ��ֵ��̬
		// Shape shape = new Circle();
		// shape.shape();
		Shape s= new Rectangel();
		s.shape();
	}
}