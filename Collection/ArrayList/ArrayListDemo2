package com.sub.ArrayList;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		
		a1.add("MSD");
		a1.add("Rohit");
		a1.add("Virat");
				
		Vector<String> v1=new Vector<>();
		
		v1.add("Shami");
		v1.add("Bumhra");
		v1.add("Siraj");
		
		IO.println("\nAdd All");
		a1.addAll(v1);
		
		a1.forEach(IO::println);
		
		IO.println("\nretain All");
		ArrayList<String> list=new ArrayList<>();
		list.add("Rohit");
		list.add("Virat");
		list.add("Hardik");
		
		
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Abhishek");
		list1.add("Head");
		list1.add("Hardik");
		
		
		list.retainAll(list1);
		IO.println(list);		

	}

}
output
------
Add All
MSD
Rohit
Virat
Shami
Bumhra
Siraj

retain All
[Hardik]
