package com.sub.vector;

import java.util.Collections;
import java.util.Vector;

record Product(Integer id,String name,Double price) implements Comparable<Product>
{

	@Override
	public int compareTo(Product p2) {
     return Integer.compare(this.id(),p2.id());
	}
	
}
public class VectorDemo2 {

	public static void main(String[] args) {
		Vector<Product> listOfProduct=new Vector<>();
		listOfProduct.add(new Product(222,"Laptop",98000D));
		listOfProduct.add(new Product(111,"Mobile",54000D));
		listOfProduct.add(new Product(333,"Camera",72000D));
		
		IO.println("\nOriginal Object : ");
		for(Product product: listOfProduct)
		{
			IO.println(product);
		}
		Collections.sort(listOfProduct);
		
		IO.println("\nSorting Object based on the id (Ascending) : ");
		for(Product product: listOfProduct)
		{
			IO.println(product);
		}
		
		IO.println("\nSorting Object based on the id (Descending) : ");
		Collections.sort(listOfProduct,(p1,p2)->p2.id().compareTo(p1.id()));
		for(Product product: listOfProduct)
		{
			IO.println(product);
		}
				
		
	}

}
OUTPUT
-----
Original Object : 
Product[id=222, name=Laptop, price=98000.0]
Product[id=111, name=Mobile, price=54000.0]
Product[id=333, name=Camera, price=72000.0]

Sorting Object based on the id (Ascending) : 
Product[id=111, name=Mobile, price=54000.0]
Product[id=222, name=Laptop, price=98000.0]
Product[id=333, name=Camera, price=72000.0]

Sorting Object based on the id (Descending) : 
Product[id=333, name=Camera, price=72000.0]
Product[id=222, name=Laptop, price=98000.0]
Product[id=111, name=Mobile, price=54000.0]
