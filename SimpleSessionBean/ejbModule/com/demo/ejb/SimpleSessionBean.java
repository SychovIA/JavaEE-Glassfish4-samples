package com.demo.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class SimpleSessionBean
 */
@Stateless
@LocalBean
public class SimpleSessionBean implements SimpleSession {
	
	 private final String message = "If you don't see this, it didn't work!";
	
    /**
     * Default constructor. 
     */
	
    public SimpleSessionBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
