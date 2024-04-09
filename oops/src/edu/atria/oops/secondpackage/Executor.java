package edu.atria.oops.secondpackage;

import edu.atria.oops.firstpackage.Base;

public class Executor extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bOne=new Base();
		//System.out.println(bOne.Private);
		//System.out.println(bOne.Default);
		//Default member is not visible outside the package
	
		
		//System.out.println(bOne.getVarProtected());
		
		//another way
		//protected member are accessible outside the package by extending the base class
		Executor ex=new Executor();
	
		System.out.println(ex.varProtected);
		//public is accessible everywhere
		System.out.println(bOne.varPublic);

	}

}
