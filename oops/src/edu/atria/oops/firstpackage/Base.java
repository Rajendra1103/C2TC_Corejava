package edu.atria.oops.firstpackage;

public class Base {
	
	//
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	


	public int getVarProtected() {
		return varProtected;
	}

	
	// declaring methods with default ,public , private,protected type types
	void methodDefault() {
		System.out.println("Default access base class");
		System.out.println("Default variable:"+varDefault);
		
	}

}
