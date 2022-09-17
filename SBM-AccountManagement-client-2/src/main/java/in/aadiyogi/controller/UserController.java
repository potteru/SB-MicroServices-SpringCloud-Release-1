package in.aadiyogi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class UserController {
	
	@GetMapping("/status/check")
	public String  getUser() {
		return "get user was called page is";
	}
	
}
