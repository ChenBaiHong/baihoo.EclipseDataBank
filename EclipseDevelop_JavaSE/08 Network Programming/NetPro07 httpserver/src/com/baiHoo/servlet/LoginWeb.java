package com.baiHoo.servlet;

import com.baiHoo.httpserver.Request;
import com.baiHoo.httpserver.Response;

public class LoginWeb extends Servlet {

	@Override
	public void doGet(Request req, Response rep) throws Exception {
		rep.println("success.....");
	}

	@Override
	public void doPost(Request req, Response rep) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
