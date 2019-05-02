package com.sreeluck.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sreeluck.demo.entity.User;


/**
 * @author sxm147
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
