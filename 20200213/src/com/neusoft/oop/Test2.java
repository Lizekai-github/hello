package com.neusoft.oop;

public class Test2 {

	public static void main(String[] args) {
		String[] actors = {"A.������","B.���»�","C.������","D.��"};
		SingleQuestion sq = new SingleQuestion(1, "��˧������˭", actors,"D");
		sq.print();
		boolean check = sq.check(new String[] {"B"});
		System.out.println(check==true?"ѡ����":"��û�۹�");
	}
}