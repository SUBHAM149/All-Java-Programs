package com.sub.link_list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class LinkedListDemo2 {

	public static void main(String[] args) 
	{
		
		//Stores the element based on the index in a non contiguous memory location
		LinkedList<Integer> numbers=new LinkedList<>();
		numbers.add(100);
		numbers.add(900);
		numbers.add(1200);
		
		IO.println(numbers.get(1));
		
		
		//Adding Or Deleting the element from first And Last Position
		LinkedList<String> listOfNames=new LinkedList<>();
		listOfNames.add("Subham");
		listOfNames.add("Sarafat");
		listOfNames.add("Asit");
		IO.println(listOfNames);
		
		listOfNames.removeFirst();
		listOfNames.removeLast();
		IO.println(listOfNames);
		
		
		List<String> listOfName=Arrays.asList("Subhax","Pradeepsu","Kurase","Subhendus");
		
		LinkedList<String> nameList=new LinkedList<>(listOfName);
		UnaryOperator<String> optr=name->name.toUpperCase();
		
		nameList.replaceAll(optr);
		IO.println(nameList);

	}

}
OUTPUT
------
 900
[Subham, Sarafat, Asit]
[Sarafat]
[SUBHAX, PRADEEPSU, KURASE, SUBHENDUS] 
