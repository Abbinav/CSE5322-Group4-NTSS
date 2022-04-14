package com.group6.ntss.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group6.ntss.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}