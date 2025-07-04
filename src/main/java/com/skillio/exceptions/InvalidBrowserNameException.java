package com.skillio.exceptions;

public class InvalidBrowserNameException extends RuntimeException{
	@Override
	public String getMessage() {
		
		return "Check browser-name inside testng.xml";
	}
}
