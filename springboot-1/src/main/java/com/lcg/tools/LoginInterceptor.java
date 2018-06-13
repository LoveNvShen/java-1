package com.lcg.tools;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lcg.application.bean.UserBean;


public class LoginInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("���󵽴�controller֮ǰ");
		//��¼֮�����
		UserBean bean  = (UserBean) request.getSession().getAttribute("BEAN");
		if(bean!=null){
			return true;
		}else{//δ��¼����
			return false;
		}
		
		
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("controller����������  ��Ⱦ֮ǰ");

	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println(" ��Ⱦ֮��");

	}

}
