/**
 * 
 */
package com.formula.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formula.dao.UserDao;
import com.formula.entity.User;

/**
 * @author Leon(Liu Yang)
 * Ideas from Formula Innovation
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	/* (non-Javadoc)
	 * @see com.formula.service.UserService#getUsers()
	 */
	@Override
	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setId(1);
		user.setName("Leon");
		users.add(user);
		return users;
	}

	/* (non-Javadoc)
	 * @see com.formula.service.UserService#getUserById()
	 */
	@Override
	public User getUserById(int id) {
		return userDao.findUserById();
	}

}
