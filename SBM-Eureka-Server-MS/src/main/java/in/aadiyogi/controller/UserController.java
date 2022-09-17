package in.aadiyogi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aadiyogi.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping
	public String  getUser() {
		
		return "get user was called page is";
	}
	
	@GetMapping(path = "/{userid}")
	public String  getUser(@PathVariable String userId) {
		
		return "user id= "+ userId;
	}
	
	@PostMapping
	public String saveUser() {
	
		return "Create user method";
	}
	
	@PutMapping
	public String updateUser() {
		return "update user method";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user";
	}


}
