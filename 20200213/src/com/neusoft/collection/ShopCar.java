package com.neusoft.collection;

import java.util.HashMap;

public class ShopCar {

	// �����в��ܴ�Ż�����������
	
	// byte short int long float double char boolean 
	// Byte Short Integer Long Float Double Character Boolean
	
//	int a = 1;
//	String str = "1";
//	Integer a = 1;
	
	HashMap<Integer,Product> carts  = new HashMap<>();
	
	// �����Ʒ�ķ���
	public void addOneProduct() {
		carts.put(1, new Product(1, "oppo", "oppo.jpg", 1000.0, 10));
		carts.put(2, new Product(2, "xiaomi", "oppo.jpg", 1000.0, 10));
		carts.put(3, new Product(3, "huawei", "oppo.jpg", 1000.0, 10));
		carts.put(4, new Product(4, "sanxing", "oppo.jpg", 1000.0, 10));
		carts.put(5, new Product(5, "chuizi", "oppo.jpg", 1000.0, 10));
		carts.put(6, new Product(6, "yijia", "oppo.jpg", 1000.0, 10));
		carts.put(7, new Product(7, "vivo", "oppo.jpg", 1000.0, 10));
		carts.put(8, new Product(8, "xiaolingtong", "oppo.jpg", 1000.0, 10));
	}
	
	// ��ѯ������Ʒ�ķ���
	public void queryProduct() {
		System.out.println(carts);
	}
	
	// �Ƴ�
	public void removeProduct() {
		carts.remove(1);
		System.out.println("�Ƴ����map:"+carts);
	}
	
	// �޸�
	public void updateProduct() {
		// new Product(1, "oppo", "oppo.jpg", 1000.0, 10)
		Product product = carts.get(1);
		product.setProName("iphone");
		carts.put(1, product);
		System.out.println("�޸ĺ��map"+carts);
	}
	
	
	
	public static void main(String[] args) {
		ShopCar shopCar = new ShopCar();
		shopCar.addOneProduct();
//		shopCar.queryProduct();
//		shopCar.removeProduct();
		shopCar.updateProduct();
	}
}
