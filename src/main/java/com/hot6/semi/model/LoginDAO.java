package com.hot6.semi.model;

import com.hot6.semi.vo.UserVO;

public interface LoginDAO {

	public int loginUser(UserVO vo);

	public UserVO getUserInfo(UserVO vo);
}
