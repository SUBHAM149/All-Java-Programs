package com.sub.ArrayList;

import java.util.ArrayList;
import java.util.List;

record Product(Integer id,String name,Double price)
{
	
}
public class ArrayListFilterDemo {

	public static void main(String[] args) {
		ArrayList<Product> listOfProduct=new ArrayList<>();
		listOfProduct.add(new Product(333,"Camera",24000D));
		listOfProduct.add(new Product(111,"lAPTOP",96000D));
		listOfProduct.add(new Product(222,"Mobile",52000D));
		listOfProduct.add(new Product(444,"Led",48000D));
		listOfProduct.add(new Product(222,"Camera",24000D));
		
		IO.println("\nOriginal Object : ");
		for(Product product:listOfProduct)
		{
			IO.println(product);
		}
		IO.println("\nUpdate Price: ");
		List<Double>updatePrice=listOfProduct
				.stream()
				.distinct()
				.filter(prod->prod.price()>=50000)
				.map(product->product.price()+5000)
				.toList();
		IO.println(updatePrice);		
		
	}

}
OUTPUT
------

Original Object : 
Product[id=333, name=Camera, price=24000.0]
Product[id=111, name=lAPTOP, price=96000.0]
Product[id=222, name=Mobile, price=52000.0]
Product[id=444, name=Led, price=48000.0]
Product[id=222, name=Camera, price=24000.0]

Update Price: 
[101000.0, 57000.0]
