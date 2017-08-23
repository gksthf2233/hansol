package com.hot6.semi.control;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hot6.semi.service.LoginService;
import com.hot6.semi.vo.UserVO;

@Controller
@RequestMapping("/login")
public class Logincontroller {
	
	@Inject
	private LoginService service;
	
	@RequestMapping("/login")
	public void loginMain(){}
	
	@RequestMapping("/loginUser")
	public ResponseEntity<UserVO> loginUser(@RequestBody UserVO vo){
		System.out.println("들어오니:"+vo);
		ResponseEntity<UserVO>	entity = null;
		
		if(service.loginUser(vo)){
			entity = new ResponseEntity<UserVO>(vo, HttpStatus.OK);
		}else{
			entity = new ResponseEntity<UserVO>(vo, HttpStatus.BAD_REQUEST);
		}
		
		return entity;
	}
}
