package com.sub.link_list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList<String> city=new LinkedList<>();
		
		city.add("BBSR");
		city.add("BHADRAK");
		city.add("BALASORE");
		city.add("CUTTACK");
		
		IO.println(city);
		
		ListIterator<String> lt=city.listIterator();
		
		
		while(lt.hasNext())
		{
			String cityName=lt.next();
			
			if(cityName.equals("BBSR"))
			{
				lt.remove();
			}
			else if(cityName.equals("BALASORE"))
			{
				lt.add("Antara");
			}
			else if(cityName.equals("CUTTACK"))
			{
				lt.set("Pune");
			}
		}
		city.forEach(System.out::println);
		
	}

}
OUTPUT
------  
[BBSR, BHADRAK, BALASORE, CUTTACK]
BHADRAK
BALASORE
Antara
Pune  
  
