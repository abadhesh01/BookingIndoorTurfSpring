package com.example.BookingIndoorTurf.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class GroundNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;
	
    public GroundNotFoundException(long id) {
		super("Ground with id="+id+" was not found!");
	}
   
}
