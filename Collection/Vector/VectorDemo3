package com.sub.vector;

import java.util.Vector;

public class VectorDemo3 {

	public static void main(String[] args) {
		Vector<Integer>listOfNumber=new Vector<>(100,10);
		IO.println("Initilal Capacity is: "+listOfNumber.capacity());
		
		for(int i=0;i<100;i++) {
			listOfNumber.add(i);
		}
		
		IO.println("After adding 100 elements : ");
		IO.println("Size is :"+listOfNumber.size());
		IO.println("Capacity is :"+listOfNumber.capacity());
		
		listOfNumber.add(999);
		IO.println("After adding 999 elements : ");
		IO.println("Size is :"+listOfNumber.size());
		IO.println("Capacity is :"+listOfNumber.capacity());
		

	}

}
OUTPUT
------
Initilal Capacity is: 100
After adding 100 elements : 
Size is :100
Capacity is :100
After adding 999 elements : 
Size is :101
Capacity is :110
