package com.store;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import java.security.Principal;
import java.security.Security;

//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;



@RestController
class HomeController{
	
	 public String getUserName(){
		 org.springframework.security.core.Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		 if (!(authentication instanceof AnonymousAuthenticationToken)) {
		    String currentUserName = authentication.getName();
		    return currentUserName;
		 }
		 else {
			 String currentUserName = "user";
			 return currentUserName;
		 } 
	 }

	 @GetMapping("/")
	 @ResponseBody
	 public HttpEntity<MessageService> message() {
		 
		 HomeController a = new HomeController();
		 String username = a.getUserName();
		 MessageService message = new MessageService();
		 message.setMessage("Hello " + username);

	 	 message.add(linkTo(methodOn(HomeController.class)
	 			.message())
	 			.withSelfRel());

	 	 return new ResponseEntity<>(message, HttpStatus.OK);
	 }
	 
}
