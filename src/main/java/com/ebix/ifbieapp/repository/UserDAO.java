package com.ebix.ifbieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebix.ifbieapp.model.User;

public interface UserDAO extends JpaRepository<User, Integer>{

}
