/**
 * 
 */
package com.formula.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formula.entity.User;
import com.formula.service.UserService;

/**
 * @author Leon(Liu Yang) Ideas from Formula Innovation
 */
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET, value = "/user")
	public List<User> getUser() {
		return userService.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
	public User getUser(@PathVariable(value = "id") String userId) {
		return userService.findOneById(Integer.parseInt(userId));
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/user")
	public void addUser(@RequestBody User user){
		userService.save(user);
	}
}
