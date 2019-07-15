package com.store;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
class HomeController{
	 
	 @GetMapping("/")
	 @ResponseBody
	 public HttpEntity<MessageService> message(@RequestParam(value = "name",
	 	required = false, defaultValue = "user") String name) {
	 	 
		 MessageService message = new MessageService("Hello " + name);
		 
	 	 message.add(linkTo(methodOn(HomeController.class)
	 			 .message(name))
	 			 .withSelfRel());
	 	 
	 	 return new ResponseEntity<>(message, HttpStatus.OK);
	 }
	 
}
