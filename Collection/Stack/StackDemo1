package com.sub.Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		
		try
		{
			s.push(12);
			s.push(15);
			s.push(22);
			s.push(33);
			s.push(49);
			IO.println("After Insertion Elements Are: "+s);
			
			
			IO.println("\nFeatching The Element Using Pop Method :");
			IO.println(s.pop());
			IO.println(s.pop());
			IO.println(s.pop());
			IO.println(s.pop());
			IO.println(s.pop());
			
		}catch(EmptyStackException e)
		{
			e.printStackTrace();
		}

	}

}
OUTPUT
------
After Insertion Elements Are: [12, 15, 22, 33, 49]

Featching The Element Using Pop Method :
49
33
22
15
12
