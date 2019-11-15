package com.store;


import org.springframework.hateoas.ResourceSupport;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Principal;
import java.util.Collection;


public class UserService extends ResourceSupport {

	private org.springframework.security.core.Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	private Object principal = authentication.getPrincipal();

	public boolean isAuthenticated() {
		return !(authentication instanceof AnonymousAuthenticationToken);
	}

	public String getUsername() {
		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		if (principal instanceof Principal) {
			return ((Principal) principal).getName();
		}
		return String.valueOf(principal);
	}

	public UserType getUserType() {
		return (isAuthenticated()) ? UserType.USER : UserType.VISITOR;
	}
}
