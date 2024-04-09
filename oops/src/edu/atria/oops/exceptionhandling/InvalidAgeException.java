package edu.atria.oops.exceptionhandling;

//program to demonstrate custom exception

public class InvalidAgeException extends Exception {// Exception class is the parent class for all the child class
	//InvalidAgeException child class
	//Throwable is the parent class for the exception class
	public InvalidAgeException() {
		super("Invalid age");
	}
	
	public InvalidAgeException(String message ) {
		super(message);
		
	}

}
