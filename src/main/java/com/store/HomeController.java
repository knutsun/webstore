package com.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
class HomeController{
	
	 @GetMapping("/")
	 @ResponseBody
	 public UserService getUser() {
	
	 	return new UserService();
	 }
}
