package com.sub.sub.hash_set_demo;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
        hs.add("Ravi");
        hs.add("Vijay");
        hs.add(new String("Ravi"));
        hs.add("Ajaya");
        hs.add("Palavi");
        hs.add("Sweta");
        hs.add(null);
        hs.add(null);
        hs.forEach(str->System.out.println(str));
	}

}
OUTPUT
------
null
Vijay
Ravi
Palavi
Ajaya
Sweta
