package edu.atria.oops.exceptionhandling;
import java.util.*;

public class AgeTestDemo {
	
	static void validate(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Invalid age!, yo not eligible to vote");
			
		}else {
			System.out.println("you are elibible to vote");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		age=sc.nextInt();
		try {
			validate(age);
		}catch(InvalidAgeException i) {
			System.out.println("exception cought........ "+i.getMessage());
			
		}
		sc.close();
		

	}

}
