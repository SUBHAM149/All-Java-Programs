
package com.sub.stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCreationUsingArray {

	public static void main(String[] args) {
		
		int []intArr= {10,12,29,35};
		IntStream intStream=Arrays.stream(intArr);
		intStream.forEach(IO::println);
		
		IO.println("----------------");
		long []longArr= {1L,9L,5L,4L};
		LongStream longStream=Arrays.stream(longArr);
		longStream.forEach(IO::println);
		
		IO.println("----------------");
		double[]doubleArr= {12D,89D,67D,10D};
		DoubleStream doubleStream=Arrays.stream(doubleArr);
		doubleStream.forEach(IO::println);
		
		IO.println("----------------");
		String []cities= {"Hyderabd","Pune","Odisha","Delhi"};
		
		Stream<String> stream=Arrays.stream(cities);
		stream.forEach(IO::println);
		
	}

}

OUTPUT
------
10
12
29
35
----------------
1
9
5
4
----------------
12.0
89.0
67.0
10.0
----------------
Hyderabd
Pune
Odisha
Delhi
