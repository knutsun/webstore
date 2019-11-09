package com.store;


import org.springframework.hateoas.ResourceSupport;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;


public class UserService extends ResourceSupport{
	

	public UserType getUserType() {

		return (isAuthenticated()) ? UserType.USER : UserType.VISITOR;	

	}

	public boolean isAuthenticated() {

		org.springframework.security.core.Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		return (!(authentication instanceof AnonymousAuthenticationToken)) ? true : false;	

	}
	
	public String getUserName(){

		String userName = SecurityContextHolder.getContext().getAuthentication().getName();

		return (isAuthenticated()) ? userName : null;	

	}
}
