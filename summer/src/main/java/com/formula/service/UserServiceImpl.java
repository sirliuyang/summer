/**
 * 
 */
package com.formula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formula.entity.User;
import com.formula.repository.UserRepository;

/**
 * @author Leon(Liu Yang) Ideas from Formula Innovation
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.formula.service.UserService#getUsers()
	 */
	@Override
	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.formula.service.UserService#getUserById()
	 */
	@Override
	public User findOneById(int id) {
		return userRepository.findOne((long) id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.formula.service.UserService#save()
	 */
	@Override
	public void save(User user) {
		userRepository.save(user);
	}

	/* (non-Javadoc)
	 * @see com.formula.service.UserService#isValid(com.formula.entity.User)
	 */
	@Override
	public boolean isValid(User user) {
		// TODO Auto-generated method stub
		return true;
	}

}
