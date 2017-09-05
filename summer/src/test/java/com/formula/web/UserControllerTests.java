/**
 * 
 */
package com.formula.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.formula.UnitTestApplication;
import com.formula.summer.service.UserService;

/**
 * @author Leon(Liu Yang) Ideas from Formula Innovation
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= UnitTestApplication.class, webEnvironment=WebEnvironment.RANDOM_PORT)
public class UserControllerTests {

	@MockBean
	private UserService userService;

	@Test
	public void testGetUsers(){
		userService.findAll();
	}
}