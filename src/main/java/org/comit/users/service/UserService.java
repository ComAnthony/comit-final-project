package org.comit.users.service;

import java.util.List;

import org.comit.users.bean.UserBean;
import org.comit.users.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public void createUser(UserBean user) {
		
		this.validateUser(user);
		
		this.userDao.createUser(user);
	}
	
	public UserBean findUser(int idUser) {
		
		return this.userDao.findUser(idUser);
	}
	
	public void validateUser(UserBean user) {
		
		if (user.geteMail().isEmpty() |
		   user.getPassword().isEmpty()) {
			throw new RuntimeException("Invalid User Data: " + user); 
		}else if (user.getCode()!=)
		
	}

}
