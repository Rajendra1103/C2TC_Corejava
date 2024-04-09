package edu.atria.oops.collectionframework;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> str=Stream.of(10,20,30,40,50);
		/*Stream<Integer> strOne=str.map(num->num+2);
		strOne.forEach(System.out::println);*/
		
		// using single line
		str.map(num->num+2).forEach(System.out::println);
		
		Integer[] values=new Integer[] {11,12,12,13,14,15};
		Arrays.stream(values).map(num->num*num).limit(4).distinct().forEach(System.out::println);

	}

}
