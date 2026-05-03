package com.sub.hash_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo8 {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.merge("Pencil",10,(oldValue, newValue)->oldValue);
		map.merge("Pencil", 20,(oldValue, newValue)->newValue);
		map.merge("Pencil",40,(oldValue,newValue)->oldValue+newValue);
		
		map.merge("Eraser",5,(oldValue,newValue)->oldValue);
		map.merge("Eraser",3,(oldValue,newValue)->oldValue-newValue);
		
		map.merge(null,10,(oldValue,newValue)->newValue);
		
		map.merge("Pen", 100,(oldValue,newValue)->null);
		
		map.merge("Sharpener", 100, (oldValue,newValue)->null);
		map.forEach((k,v)->IO.println(k+" : "+v));
		
		

	}

}
OUTPUT
------
null : 10
Sharpener : 100
Pen : 100
Pencil : 60
Eraser : 2
  
