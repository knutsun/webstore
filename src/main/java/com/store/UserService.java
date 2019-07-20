package com.store;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;


public class UserService extends ResourceSupport{

	public Boolean isAuthenticated() {
		 org.springframework.security.core.Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		 if (!(authentication instanceof AnonymousAuthenticationToken)) {
			 return true;
		 }
		 else {
			 return false;
		 }
	}
	
	public String getUserName(){
		 
		 if (isAuthenticated()) {
		    String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();
		    return currentUserName;
		 }
		 else {
			 String currentUserName = "user";
			 return currentUserName;
		 } 
	 }
}