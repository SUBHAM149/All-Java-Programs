package com.sub.Stack;

import java.util.Stack;

public class StackDemo4 {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<>();
		stk.push("Apple");
		stk.push("Grapsh");
		stk.push("Mango");
		
		IO.println("Offset Position is : "+stk.search("Mango"));
		IO.println("Offset Position is : "+stk.search("Banana"));
		IO.println("IS  Stack Empty :"+stk.empty());
		IO.println("Index Position Is : "+stk.indexOf("Mango"));

	}

}
OUTPUT
------
Offset Position is : 1
Offset Position is : -1
IS  Stack Empty :false
Index Position Is : 2
