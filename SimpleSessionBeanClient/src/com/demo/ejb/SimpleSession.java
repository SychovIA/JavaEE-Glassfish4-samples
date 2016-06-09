package com.demo.ejb;

import javax.ejb.Remote;

@Remote
public interface SimpleSession {
	public String getMessage();
}
