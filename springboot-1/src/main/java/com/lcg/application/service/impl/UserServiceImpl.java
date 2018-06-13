package com.lcg.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcg.application.bean.UserBean;
import com.lcg.application.mapper.UserDao;
import com.lcg.application.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao udao;
	/**
	 * µÇÂ¼
	 */
	public UserBean checkLogin(UserBean bean) {
		UserBean user = udao.checkLogin(bean);
		return user;
	}

	public UserDao getUdao() {
		return udao;
	}

	public void setUdao(UserDao udao) {
		this.udao = udao;
	}
	
	
	

}
