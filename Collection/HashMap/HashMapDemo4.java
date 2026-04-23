package com.sub.hash_map;

import java.util.HashMap;

record Employee(Integer empId,String empNmae) {
	
}
public class HashMapDemo4 {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"Subham");
		Employee e2= new Employee(102,"Poja");
		Employee e3= new Employee(102,"Poja");
		Employee e4= new Employee(102,"Poja");
		
		HashMap<Employee,String> hm=new HashMap<>();
		hm.put(e1, "Ameerpet");
		hm.put(e2, "S R Nagar");
		hm.put(e3, "Begumpet");
		hm.put(e4,"ODISHA");
		hm.forEach((k,v)->System.out.println(k+" "+v));

	}

}
OUTPUT
------
Employee[empId=102, empNmae=Poja] ODISHA
Employee[empId=101, empNmae=Subham] Ameerpet
