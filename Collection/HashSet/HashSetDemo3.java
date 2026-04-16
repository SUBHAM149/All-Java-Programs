package com.sub.sub.hash_set_demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo3 {

	public static void main(String[] args) {
		Boolean values[]=new Boolean[6];
		
		Set<Object> set=new HashSet<>();
		values[0]=set.add(12);
		values[1]=set.add(12);
		values[2]=set.add("Ravi");
		values[0]=set.add(new String("Ravi"));
		values[0]=set.add(true);
		values[0]=set.add(true);
		
		IO.println(Arrays.toString(values));
	}

}
OUTPUT
------
[false, false, true, null, null, null]  
