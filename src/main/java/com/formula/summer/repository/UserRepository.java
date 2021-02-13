/**
 * 
 */
package com.formula.summer.repository;

import org.springframework.data.repository.CrudRepository;

import com.formula.summer.entity.User;

/**
 * @author Leon(Liu Yang)
 * Ideas from Formula Innovation
 */
public interface UserRepository extends CrudRepository<User, Long>{
}
