package com.lcg.tools;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lcg.application.bean.UserBean;


public class LoginInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("请求到达controller之前");
		//登录之后放行
		UserBean bean  = (UserBean) request.getSession().getAttribute("BEAN");
		if(bean!=null){
			return true;
		}else{//未登录拦截
			return false;
		}
		
		
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("controller处理完请求  渲染之前");

	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println(" 渲染之后");

	}

}
