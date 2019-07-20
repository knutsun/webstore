package com.store;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;


public class UserService extends ResourceSupport{

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
}