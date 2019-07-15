package com.store;
import org.springframework.hateoas.ResourceSupport;


public class MessageService extends ResourceSupport{

 	private String message;
 	
	public String getMessage() {
		
		return message;
	}
	
	public void setMessage(String message) {
		
		this.message = message;
	}
	
}
