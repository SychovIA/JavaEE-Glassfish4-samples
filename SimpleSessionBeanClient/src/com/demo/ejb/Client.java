package com.demo.ejb;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.naming.NamingException;


@Named
@RequestScoped
public class Client {
	private String message;
	@EJB
	 private  SimpleSession simpleSession;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String showMessage() throws NamingException{
		String retVal = "confirmation";
       message =  simpleSession.getMessage();
       return retVal;
    }
}
