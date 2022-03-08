package com.example.BookingIndoorTurf.exception;

import java.util.Date;

public class ErrorDetails {
   
	private Date timestamp;
	private String message;
	private String request;
	
	public ErrorDetails(Date timestamp, String message, String request) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.request = request;
	}
	
}
