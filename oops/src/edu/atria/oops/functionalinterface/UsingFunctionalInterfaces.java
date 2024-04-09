package edu.atria.oops.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Display{
	static void show(String s) {
		System.out.println("******* "+s+" ********");
	}
}

public class UsingFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//:: is meaning method referencing
		//display is the class and show is the method procedure for method reference
		Consumer<String> consumer = Display::show;
		consumer.accept("Amith");
		// -> "hello"  meaning lambda function
		
		Supplier<String> supplier=() -> "Hello from Supplier!";
		consumer.accept(supplier.get());
		
		// positive//negative number test 
		Predicate<Integer> predicate = num -> num > 0;
		System.out.println(predicate.test(24));
		System.out.println(predicate.test(-20));
		// max test
		BiFunction<Integer,Integer,Integer> maxFunction=(x,y) -> x>y?x:y;
		System.out.println(maxFunction.apply(25, 14));
		
		BiFunction<String, Integer, String> printFunction=(name,num)->name+num;
		System.out.println(printFunction.apply("Good Evening ", 2));
		
		
		
		
		
	}

}
 