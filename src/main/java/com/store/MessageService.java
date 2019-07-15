package com.store;
import org.springframework.hateoas.ResourceSupport;


public class MessageService extends ResourceSupport{

 	private String message;
 	
	public MessageService() {}
	public MessageService(String message) {
		 
		 this.message = message;
	}
	
	public String getMessage() {
		
		return message;
	}
	
	public void setMessage(String message) {
		
		this.message = message;
	}
	
}
