package com.mvc.service.impl;

import com.mvc.dao.LoginDao;
import com.mvc.dao.impl.LoginDaoImpl;
import com.mvc.dto.LoginDTO;
import com.mvc.service.LoginService;

public class LoginServiceImpl implements LoginService{
	private LoginDao logindao;
	@Override
	public String loginUser(LoginDTO logindto) {
		
		logindao=new LoginDaoImpl();
		String dbPASSWORD=logindao.loginUser(logindto);
		
	}

}
