package com.sub.vector;

import java.util.Vector;

record Employee(Integer id,String name,Double slary)
{
	
}
public class VectorDemo5 {

	public static void main(String[] args) {
		Vector<Employee> listOfEmployees=new Vector<>();
		listOfEmployees.add(new Employee(101,"Scott",78890.90));
		listOfEmployees.add(new Employee(102,"Smith",98890.90));
		listOfEmployees.add(new Employee(103,"John",65890.90));
		listOfEmployees.add(new Employee(104,"Alen",91890.90));
		listOfEmployees.add(new Employee(105,"Sanju",99890.90));
		
		
		
		IO.println("Original Object");
		for(Employee employee:listOfEmployees)
		{
			IO.println(employee);
		}
		
		IO.println("Delete the employee object on the id : ");
		
		Integer id=Integer.valueOf(IO.readln("Enter Employee Id: "));
		
		for(Employee employee : listOfEmployees)
		{
			if(employee.id().equals(id));
			{
				listOfEmployees.remove(employee);
				break;
			}
		}
		
		IO.println("Aftrer Deleting : ");
		for(Employee employee:listOfEmployees)
		{
			IO.println(employee);
		}	
	}
OUTPUT
------
Original Object
Employee[id=101, name=Scott, slary=78890.9]
Employee[id=102, name=Smith, slary=98890.9]
Employee[id=103, name=John, slary=65890.9]
Employee[id=104, name=Alen, slary=91890.9]
Employee[id=105, name=Sanju, slary=99890.9]
Delete the employee object on the id : 
Enter Employee Id: 1
Aftrer Deleting : 
Employee[id=102, name=Smith, slary=98890.9]
Employee[id=103, name=John, slary=65890.9]
Employee[id=104, name=Alen, slary=91890.9]
Employee[id=105, name=Sanju, slary=99890.9]

}
