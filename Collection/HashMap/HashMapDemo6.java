package com.sub.hash_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo6 {

	public static void main(String[] args) {
		Map<String,Integer> frequency=new HashMap<>();
		
		String text="Java is fun, Java is Powerful java is greatt";
		String words[]=text.split("");
		
		for(String word:words)
		{
			frequency.put(word, frequency.getOrDefault(words, 0)+1);
		}
		IO.println(frequency);

	}

}
OUTPUT
------
{ =1, a=1, e=1, f=1, g=1, i=1, J=1, j=1, ,=1, l=1, n=1, o=1, P=1, r=1, s=1, t=1, u=1, v=1, w=1}
