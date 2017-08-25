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

	@Override
	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User findOneById(long id) {
		return userRepository.findOne(id);
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public void update(User user) {
		userRepository.save(user);
	}

	@Override
	public boolean isValid(User user) {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see com.formula.service.UserService#remove(long)
	 */
	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

}
