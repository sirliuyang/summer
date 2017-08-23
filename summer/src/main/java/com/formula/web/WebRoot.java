/**
 * 
 */
package com.formula.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leon(Liu Yang)
 * Ideas from Formula Innovation
 */
@RestController
public class WebRoot {
	
	@RequestMapping
	public String welcome(){
		return "Welcome";
	}
}
