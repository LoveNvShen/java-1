package com.lcg.application;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcg.application.bean.UserBean;
import com.lcg.application.service.UserService;


@Controller
public class LoginController {
	@Autowired
	private UserService uservice;
	//@ResponseBody
	@RequestMapping(method=RequestMethod.GET,value="checkLogin")
	public String checkLogin(UserBean bean,HttpServletRequest req,Map<String,String> map){
	    	 UserBean user =	uservice.checkLogin(bean); 
	    if(user!=null){
	    	req.getSession().setAttribute("BEAN", user);
	    	System.out.println("登录成功");
	    	map.put("hello", "BANAER success");
	    	return "/index";
	    }else{
	    	System.out.println("登录失败");
	    	map.put("hello", "BANAER loser");
	    	return "/login";
	    }
		
	}
	
	@RequestMapping("test1")
	public String test1(){
		System.out.println("test1");
		return "login";
	}

	public UserService getUservice() {
		return uservice;
	}


	public void setUservice(UserService uservice) {
		this.uservice = uservice;
	}

	
	
}
