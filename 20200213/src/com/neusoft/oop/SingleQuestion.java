package com.neusoft.oop;

public class SingleQuestion extends Question {

	// ��ѡ���
	String answer;
	
	public SingleQuestion(int id,String text,String[] options,String answer) {
		this.id = id;
		this.text = text;
		this.options = options;
		this.answer = answer;
	}
	
	// ��ѡ���𰸵��߼�
	@Override
	public boolean check(String[] ans) {
		if(null == ans || ans.length > 1){
			return false;
		}
		return this.answer.equals(ans[0]);
	}
}