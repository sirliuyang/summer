/**
 * 
 */
package com.formula.summer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formula.summer.entity.User;
import com.formula.summer.repository.UserRepository;

import lombok.extern.log4j.Log4j;

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
	public void remove(long id) {
		userRepository.delete(id);
	}

	@Override
	public boolean isValid(User user) {
		return true;
	}
}
