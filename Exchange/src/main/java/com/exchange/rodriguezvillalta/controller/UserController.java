package com.exchange.rodriguezvillalta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {
	
	@GetMapping("/users")
	public String getUsers() {
		return "Displaying users";
	}
	
	@GetMapping("/users/{id}")
	public String getUser(@RequestParam Long id) {
		return "Fetching user details "+ id;
	}
	
	
	@DeleteMapping("/users")
	public String deleteUser(@RequestParam Long id) {
		return "Deleting user details " +id ;
	}
}
