/**
 * 
 */
package com.formula.summer.dao;

import org.springframework.stereotype.Repository;

import com.formula.summer.entity.User;

/**
 * @author Leon(Liu Yang) Ideas from Formula Innovation
 */
@Repository
public class UserDaoImpl implements UserDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.formula.dao.UserDao#findUserById()
	 */
	@Override
	public User findUserById() {
		User user = new User();
		user.setId(1);
		user.setName("Leon");
		return user;
	}

}
