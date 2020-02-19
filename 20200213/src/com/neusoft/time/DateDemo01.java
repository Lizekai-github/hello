package com.neusoft.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo01 {

	
	public static void main(String[] args) {
//		Date date = new Date();
		//util Wed Feb 19 16:34:24 CST 2020
		//System.out.println(date);
		//sql
		// 1970-01-01 00:00:00 - now ����ֵ
		//long currentTimeMillis = System.currentTimeMillis();
		//Date date2 = new Date(currentTimeMillis);
		// 2020-02-19
		//System.out.println(date2);
		
		// �ı���ʽ��
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String format = simpleDateFormat.format(date);
		System.out.println(format);
		
		// �ڵ�ǰ��ʱ��+100�� ֮����ʲôʱ��
		// ������calendar����
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		int year = c.get(Calendar.YEAR);    //ͨ��get������õ�ǰ��
        int month = c.get(Calendar.MONTH) + 1;    //�·�0-11����Ҫ��1
        int day = c.get(Calendar.DAY_OF_MONTH);    //����
        int hour = c.get(Calendar.HOUR_OF_DAY);    //��ȡСʱ
        int minute = c.get(Calendar.MINUTE);    //��ȡ����
        int second = c.get(Calendar.SECOND);    //��ȡ����
        System.out.println("��ǰʱ�䣺" + year + "��" + month + "��" + day + "��" + "   " + hour + 
                ":" + minute + ":" + second);
		
        c.add(Calendar.SECOND, 120);
        int year2 = c.get(Calendar.YEAR);    //ͨ��get������õ�ǰ��
        int month2 = c.get(Calendar.MONTH) + 1;    //�·�0-11����Ҫ��1
        int day2 = c.get(Calendar.DAY_OF_MONTH);    //����
        int hour2 = c.get(Calendar.HOUR_OF_DAY);    //��ȡСʱ
        int minute2 = c.get(Calendar.MINUTE);    //��ȡ����
        int second2 = c.get(Calendar.SECOND);    //��ȡ����
        System.out.println("����֮���ʱ�䣺" + year2 + "��" + month2 + "��" + day2 + "��" + "   " + hour2 + 
                ":" + minute2 + ":" + second2);
		
	}
}