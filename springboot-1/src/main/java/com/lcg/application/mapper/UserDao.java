package com.lcg.application.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.lcg.application.bean.UserBean;


@Mapper
public interface UserDao {
	//µÇÂ¼
	public UserBean checkLogin(UserBean bean);

}
