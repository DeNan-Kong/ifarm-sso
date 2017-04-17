package com.ifarm.sso.service;

import com.ifarm.common.pojo.IfarmResult;
import com.ifarm.domin.TbUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {

	IfarmResult checkData(String content, Integer type);
	IfarmResult createUser(TbUser user);
	IfarmResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response);
	IfarmResult getUserByToken(String token);
}
