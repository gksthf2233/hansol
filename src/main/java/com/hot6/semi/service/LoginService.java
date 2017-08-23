package com.hot6.semi.service;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.hot6.semi.model.LoginDAO;
import com.hot6.semi.vo.UserVO;

@Service
public class LoginService {
	
	@Inject
	private SqlSessionTemplate sqlSession;
	
	public LoginDAO loginMapper(){
		return sqlSession.getMapper(LoginDAO.class);
	}
	
	public boolean loginUser(UserVO vo){
		if(loginMapper().loginUser(vo)>0){
			return true;
		}
		return false;
	}
	
	/*public UserVO getUserInfo(UserVO vo){
		return vo = loginMapper().getUserInfo(vo);
		} */
}
