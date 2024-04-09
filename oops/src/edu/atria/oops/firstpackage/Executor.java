package edu.atria.oops.firstpackage;

public class Executor {
	public static void main(String[] args) {
		Base bOne=new Base();
		//bOne.methodDefault();
		System.out.println(bOne.varDefault);
		System.out.println(bOne.varPublic);
		System.out.println(bOne.varProtected);
		//System.out.println(bOne.varPrivate);
		
		//private members are not visible outside the class
	}

}
