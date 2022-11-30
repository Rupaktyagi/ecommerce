package com.rupak.service;

import com.rupak.dto.LoginDTO;
import com.rupak.exception.LoginException;

public interface LoginService {
	
	public String logInAccount(LoginDTO login) throws LoginException;
	
	public String logOutfromAccount(String key) throws LoginException;

}
