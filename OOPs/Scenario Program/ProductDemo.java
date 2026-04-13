package com.sub.comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

  class Product implements Comparable<Product>
{
	private Integer productNumber;
	private String productName;
	private double productPrice;
	

	public Product(Integer productNumber,String productName,double productPrice)
	{
		this.productNumber=productNumber;
		this.productName=productName;
		this.productPrice=productPrice;
	}
	 public String getProductName() {
	        return productName;
	    }
	 
	 @Override
	    public int compareTo(Product p) {
	        return this.productName.compareTo(p.productName);
	    }
	 @Override
	    public String toString() {
	        return productNumber + " " + productName + " " + productPrice;
	    }
		
}

public class ProductDemo {

	public static void main(String[] args) {
		ArrayList<Product> list=new ArrayList<>();
		list.add(new Product(101,"Laptop",80000.00));
		list.add(new Product(102,"Mobile",40000.00));
		list.add(new Product(103,"Desktop",50000.00));
		
		
		Collections.sort(list);
		
		System.out.println("Sorted Product Listr(By Name) : ");
		for(Product p:list)
		{
			System.out.println(p);
		}

	}

}
