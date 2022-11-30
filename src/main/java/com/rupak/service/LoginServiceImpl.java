package com.rupak.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rupak.dto.LoginDTO;
import com.rupak.exception.LoginException;
import com.rupak.model.CurrentUsersSession;
import com.rupak.model.Customer;
import com.rupak.repository.CustomerDAO;
import com.rupak.repository.SessionDAO;

import net.bytebuddy.utility.RandomString;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private CustomerDAO cDao;
	
	@Autowired
	private SessionDAO sDao;

	@Override
	public String logInAccount(LoginDTO login) throws LoginException {
		
		Optional<Customer> c=cDao.findByMobileNumber(login.getMobileNumber());
		
		if(c.isPresent()) {
			Optional<CurrentUsersSession> cu=sDao.findById(c.get().getCustomerId());
			if(cu.isPresent()) {
				throw new LoginException("User Already login");
			}else {
				if(c.get().getPassword().equals(login.getPassword())) {
				
				String key=RandomString.make(6);
				
				CurrentUsersSession currentuserSession= new CurrentUsersSession(c.get().getCustomerId(), key, LocalDateTime.now());
				
				CurrentUsersSession curr=sDao.save(currentuserSession);
					return curr.toString();
					
				}else {
				throw  new LoginException("please Enter valid password");
			}
			}
		}else {
			throw new LoginException("Enter the valid Mobile number");
		}


	}

	@Override
	public String logOutfromAccount(String key) throws LoginException {
		
		CurrentUsersSession session=sDao.findByUuid(key);

		if(session==null) {
			throw new LoginException("Enter the valid key");
		}else {
			sDao.delete(session);
			return "LogOut";
		}
	}
}
