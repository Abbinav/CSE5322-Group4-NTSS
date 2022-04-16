package com.group6.ntss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group6.ntss.dao.UserRepository;
import com.group6.ntss.model.User;

@Controller
public class LoginController {

	@Autowired
	UserRepository repo;
	
	@PostMapping(path = "/userLogin")
	public String login(User user)
	{		
		if(user != null && user.getEmail()!= null)
		{
			User newUser = new User();
			newUser = repo.findByEmail(user.getEmail());
			if(newUser!= null && user.getEmail().equalsIgnoreCase(newUser.getEmail()))
			{
				System.out.println("email" + newUser.getEmail());
				System.out.println("password" + newUser.getPassword());
				System.out.println("id" + newUser.getUserId());
				System.out.println("userType" + newUser.getUserType());
			}
		}
		return "home";
		
	}
	
	@GetMapping(path = "/login")
	public String userLogin()
	{
		System.out.println("email" );
		System.out.println("password");
		System.out.println("id" );
		
		return "login";
		
	}
}
