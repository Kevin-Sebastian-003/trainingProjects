package com.genbank.backend.controller;

import com.genbank.backend.repository.UserRepo;

import java.util.List;

import com.genbank.backend.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class UserController {

	@Autowired
	private UserRepo repo;
	
	// get all accounts
	@GetMapping("/users/all")
	public List<User> getAllEmployees(){
		return repo.getAllUsers();
	}		
	
	// add user
	@GetMapping("/users/{userName}/{password}")
	public boolean validateLogin(@PathVariable("userName") String userName, @PathVariable("password") String password) {
		User user = repo.getUserByUsername(userName);
		if (user == null)
			return false;
		else
			if(user.getPassword() == password)
				return true;
			else
				return false;
	}
	
	// update password
	@PutMapping("/users/{userName}/{password}")
	public void updateEmployee(@PathVariable("userName") String userName, @PathVariable("password") String password) {
		repo.updatePassword(userName, password);
	}
	
	// delete employee rest api
	@DeleteMapping("/users/{userName}")
	public void deleteUser(@PathVariable("userName") String userName){
		repo.deleteUser(userName);
	}
		
}