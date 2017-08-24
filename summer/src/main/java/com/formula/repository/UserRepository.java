/**
 * 
 */
package com.formula.repository;

import org.springframework.data.repository.CrudRepository;

import com.formula.entity.User;

/**
 * @author Leon(Liu Yang)
 * Ideas from Formula Innovation
 */
public interface UserRepository extends CrudRepository<User, Long>{
}
