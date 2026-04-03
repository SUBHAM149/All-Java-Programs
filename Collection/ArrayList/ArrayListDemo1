package com.sub.ArrayList;

import java.util.ArrayList;

record Employee(Integer id,String name,Double salary)
{
	
}

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<Employee> listOfEmployees=new ArrayList<>();
		
		listOfEmployees.add(new Employee(101,"Subham",450000d));
		listOfEmployees.add(new Employee(102,"Manoj",580000d));
		listOfEmployees.add(new Employee(103,"Chiku",900000d));
		listOfEmployees.add(new Employee(104,"Raj",700000d));
		listOfEmployees.add(new Employee(105,"Mahomad",850000d));
		
		
		IO.println("Printing Original Data");
		for(Employee employee: listOfEmployees)
		{
			IO.println(employee);
		}
		//READ
		Integer id=Integer.valueOf(IO.readln("\nEnter Employee id to Search : "));
		
		boolean isFound=false;
		for(Employee employee : listOfEmployees)
		{
			if(employee.id().equals(id))
			{
				IO.println("Employee With "+id+" is "+employee);
				isFound=true;
				break;
			}
		}
		
		
		if(!isFound)
		{
			System.err.println("Employee with "+id+" is not exiting.");
		}
		
		//UPDATE
		id=Integer.valueOf(IO.readln("\nEnter Employee id to Update : "));
		for(int i=0;i<listOfEmployees.size();i++)
		{
			Employee employee=listOfEmployees.get(i);
			if(employee.id().equals(id))
			{
				listOfEmployees.set(i,new Employee(employee.id(), employee.name(),90000D));
				break;
			}
		}
		IO.println("Employee Record aftre Updating The Salary : ");
		for(Employee employee : listOfEmployees)
		{
			IO.println(employee);
		}
		
		
		
		//Delete
		int id1=Integer.valueOf(IO.readln("\nEnter Employee id to Delete : "));
		
		listOfEmployees.removeIf(emp->emp.id().equals(id1));
		
		IO.println("Employees Recprd After Deletion : ");
		for(Employee employee : listOfEmployees)
		{
			IO.println(employee);
		}
		
		

	}

}
OUTPUT
-------
Printing Original Data
Employee[id=101, name=Subham, salary=450000.0]
Employee[id=102, name=Manoj, salary=580000.0]
Employee[id=103, name=Chiku, salary=900000.0]
Employee[id=104, name=Raj, salary=700000.0]
Employee[id=105, name=Mahomad, salary=850000.0]

Enter Employee id to Search : 103
Employee With 103 is Employee[id=103, name=Chiku, salary=900000.0]

Enter Employee id to Update : 103
Employee Record aftre Updating The Salary : 
Employee[id=101, name=Subham, salary=450000.0]
Employee[id=102, name=Manoj, salary=580000.0]
Employee[id=103, name=Chiku, salary=90000.0]
Employee[id=104, name=Raj, salary=700000.0]
Employee[id=105, name=Mahomad, salary=850000.0]

Enter Employee id to Delete : 103
Employees Recprd After Deletion : 
Employee[id=101, name=Subham, salary=450000.0]
Employee[id=102, name=Manoj, salary=580000.0]
Employee[id=104, name=Raj, salary=700000.0]
Employee[id=105, name=Mahomad, salary=850000.0]

