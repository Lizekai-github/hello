package com.neusoft.servlet;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.neusoft.entity.User;
import com.sun.xml.internal.ws.developer.SerializationFeature;

/**
 * Servlet implementation class AjaxServ
 */
@WebServlet("/AjaxServ")
public class AjaxServ extends HttpServlet {
	
    public AjaxServ() {
       
    }
    
    @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
    	User user = new User(1, "����", "123456", new java.util.Date());
		User user2 = new User(2, "����2", "123456", new java.util.Date());
		User user3 = new User(3, "����3", "123456", new java.util.Date());
		ArrayList<User> arrayList = new ArrayList<User>();
		arrayList.add(user);
		arrayList.add(user2);
		arrayList.add(user3);
		String jsonString = JSON.toJSONString(arrayList,SerializerFeature.WriteDateUseDateFormat);
    	resp.getWriter().print(jsonString);
	}
}