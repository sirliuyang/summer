/**
 * 
 */
package com.formula.service;

import java.util.List;

import com.formula.entity.User;

/**
 * @author Leon(Liu Yang)
 * Ideas from Formula Innovation
 */
public interface UserService {
	public User getUserById(int id);
	public List<User> getUsers();
}