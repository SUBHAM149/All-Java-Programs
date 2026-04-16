package com.sub.sub.hash_set_demo;

import java.util.HashSet;
public class HashSetDemo4 {

	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<>();
		
		while(true)
		{
			System.out.println("Option:");
			System.out.println("1. Add Element");
			System.out.println("2. Delete Element");
			System.out.println("3. Display Element");
			System.out.println("4.Exit...");
			
			System.out.println("Enter Your Choice(1/2/3/4): ");
			int choice=Integer.parseInt(IO.readln());
			
			switch(choice)
			{
			case 1->
			{
				String elementToAdd=IO.readln("Enter the element to add: ");
				if(hashSet.add(elementToAdd))
				{
					IO.println("Element "+elementToAdd+" Added Sucessfully..");
				}else
				{
					IO.println(elementToAdd+" element is alredy Available.");
				}
			}
			
			case 2->
			{
				String elementToDelete=IO.readln("Enter The Element To Delete: ");
				if(hashSet.isEmpty())
				{
					IO.println("HashSet is Emplty,Nothing to Delete.");
					System.exit(0);
				}
				boolean isRemoved=hashSet.remove(elementToDelete);
				if(isRemoved)
				{
					IO.print(elementToDelete+" Is Deleted Sucessfully..");
				}
				else {
					IO.println(elementToDelete+" is Not Available.");
				}
			}
			case 3->
			{
				IO.println(hashSet);
			}
			case 4->
			{
				System.out.println("Exiting Program.");
				System.exit(0);
			}
			default->System.out.println("Invelid Choice.Plese Try Again..");	
			
			}
			System.out.println();
		}

	}

}
OUTPUT
------
  Option:
1. Add Element
2. Delete Element
3. Display Element
4.Exit...
Enter Your Choice(1/2/3/4): 
1
Enter the element to add: 20
Element 20 Added Sucessfully..

Option:
1. Add Element
2. Delete Element
3. Display Element
4.Exit...
Enter Your Choice(1/2/3/4): 
1
Enter the element to add: 30
Element 30 Added Sucessfully..

Option:
1. Add Element
2. Delete Element
3. Display Element
4.Exit...
Enter Your Choice(1/2/3/4): 
1
Enter the element to add: 40
Element 40 Added Sucessfully..

Option:
1. Add Element
2. Delete Element
3. Display Element
4.Exit...
Enter Your Choice(1/2/3/4): 
2
Enter The Element To Delete: 30
30 Is Deleted Sucessfully..
Option:
1. Add Element
2. Delete Element
3. Display Element
4.Exit...
Enter Your Choice(1/2/3/4): 
3
[40, 20]

Option:
1. Add Element
2. Delete Element
3. Display Element
4.Exit...
Enter Your Choice(1/2/3/4): 
4
Exiting Program.
  
