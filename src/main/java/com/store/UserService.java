package com.store;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;


public class UserService extends ResourceSupport{
	

	public UserType getUserType() {
		 if (isAuthenticated()) {
			 return UserType.USER;
		 }
		 else {
			 return UserType.VISITOR;
		 }
		
	}
	
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
		    return SecurityContextHolder.getContext().getAuthentication().getName();
		 }
		 else {
			 return null;
		 } 
	 }
}