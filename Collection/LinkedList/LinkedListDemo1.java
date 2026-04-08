package com.sub.link_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) 
	{
		final int ITERATION=100000;
		
		ArrayList<Integer> a1=new ArrayList<>();
		long startTime =System.currentTimeMillis();
		
		for(int i=0;i<ITERATION;i++)
		{
			a1.add(0,i);
		}
		
		long endTime=System.currentTimeMillis();
		IO.println("Total Time Taken By ArrayList Class : "+(endTime-startTime)+" ms.");
		LinkedList<Integer>list=new LinkedList<>();
		
		startTime=System.currentTimeMillis();
		for(int i=0;i<ITERATION;i++)
		{
			list.add(0,i);
		}
		endTime=System.currentTimeMillis();
		IO.println("Total Time Taken By LinkList Class : "+(endTime-startTime)+" ms.");
		
	}

}
OUTPUT
------
Total Time Taken By ArrayList Class : 251 ms.
Total Time Taken By LinkList Class : 4 ms.
  
