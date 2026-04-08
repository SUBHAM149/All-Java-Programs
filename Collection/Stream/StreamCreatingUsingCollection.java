package com.sub.stream;

import java.util.Vector;

public class StreamCreatingUsingCollection {

	public static void main(String[] args) 
	{
		Vector<Integer>listOfInteger=new Vector<>();
		listOfInteger.add(12);
		listOfInteger.add(90);
		listOfInteger.add(87);
		listOfInteger.add(56);
		listOfInteger.add(45);
		listOfInteger.add(55);
		
		IO.println("1) Without Stream API...");
		Vector<Integer> evenList=new Vector<>();
		for(Integer num: listOfInteger)
		{
			if(num%2==0)
			{
				evenList.add(num);
			}
		}
		evenList.forEach(IO::println);
		
		IO.println("2)Using Stream API...");
		listOfInteger
		.stream()
		 .filter(num-> num%2==0)
		   .forEach(IO::println);
		
		
		IO.println("3)Parallel Stream Approach...");
		
		Vector<String> listOfFruits=new Vector<>();
		listOfFruits.add("Grapes");
		listOfFruits.add("Mango");
		listOfFruits.add("Orange");
		listOfFruits.add("Apple");
		
		listOfFruits
		.parallelStream()
		.forEach(IO::println);
			
		
	}

}
OUTPUT
------
1) Without Stream API...
12
90
56
2)Using Stream API...
12
90
56
3)Parallel Stream Approach...
Orange
Apple
Grapes
Mango
