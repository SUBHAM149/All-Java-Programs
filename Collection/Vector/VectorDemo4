package com.sub.vector;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo4 {

	public static void main(String[] args) {
		Vector<Integer>listOfNumber=new Vector<>();
		listOfNumber.add(67);
		listOfNumber.add(34);
		listOfNumber.add(99);
		listOfNumber.add(12);
		listOfNumber.add(29);
		
		IO.println("Original Data : "+listOfNumber);
		
		Collections.sort(listOfNumber,Integer::compareTo);
		IO.println("Ascending Order : "+listOfNumber);
		
		
		Collections.sort(listOfNumber,Collections.reverseOrder());
		IO.println("Descending Order : "+listOfNumber);
		
		IO.println("Max Element : "+Collections.max(listOfNumber));
		IO.println("Min Element : "+Collections.min(listOfNumber));
				

	}

}
OUTPUT
------
Original Data : [67, 34, 99, 12, 29]
Ascending Order : [12, 29, 34, 67, 99]
Descending Order : [99, 67, 34, 29, 12]
Max Element : 99
Min Element : 12
