package com.sub.Stack;

import java.util.Stack;

public class StackDemo3 {

	public static void main(String[] args) {
		
		
		
		Stack<String> stk=new Stack<>();
		stk.push("Apple");
		stk.push("Mango");
		stk.push("Orange");
		stk.push("Graphs");
		IO.println("Stack : "+stk);
		
		
		String fruit=stk.peek();
		IO.println("Elements at Top:"+fruit);
		IO.println("Stack Elemnets are : "+stk);
		
	}

}
OUTPUT
-------
Stack : [Apple, Mango, Orange, Graphs]
Elements at Top:Graphs
Stack Elemnets are : [Apple, Mango, Orange, Graphs]
