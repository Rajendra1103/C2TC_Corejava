package edu.atria.oops.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cant instantiate the list
		//List list=new List();
		
		List list=new ArrayList();
		list.add(0, 1);
		list.add(1, "Rajendra");
		list.add(2,'M');
		list.add(3, 98.9f);
		list.add(4, 7349031103l);
		System.out.println(list);
		System.out.println("element in the 1st index: "+list.get(1));
		//System.out.println("element in the 7th index: "+list.get(7));//exception
		System.out.println(list.contains("R"));
		System.out.println(list.size());
		list.add(5, "Rajendra");
		System.out.println(list);
		list.add(6,null);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
		

	}

}
