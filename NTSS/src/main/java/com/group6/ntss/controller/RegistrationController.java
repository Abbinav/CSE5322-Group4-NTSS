package com.group6.ntss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group6.ntss.dao.UserRepository;
import com.group6.ntss.model.User;

@Controller
public class RegistrationController {
	
	@Autowired
	UserRepository repo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/signup")
	public String getUserDetails() {		
		return "signup";
	}

	@PostMapping(path ="/registerUser")
	public String registerUser(User user)
	{
	    System.out.println("Username= " + user.getEmail());
	    System.out.println("Password= " + user.getPassword());
	    System.out.println("UserType= " + user.getUserType());	    
	    	
		repo.save(user);
		return "home";
	}
	

}
