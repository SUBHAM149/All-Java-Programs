package com.sub.hash_map;

import java.util.HashMap;

public class HashMapDemo7 {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.computeIfAbsent("Apple", key->10);
		map.computeIfAbsent("Apple", key->10);
		map.computeIfAbsent("Mango", key->50);
		map.computeIfAbsent("Graphs", key->key.length());
		map.computeIfAbsent(null, key->100);
		map.computeIfAbsent("Kiwi", key->500);
		map.computeIfAbsent("Kiwi", key->500);
		map.computeIfAbsent("Kiwi", key->null);
		map.computeIfAbsent("Orange", key->null);
		
		map.forEach((k,v)->IO.println(k+" "+v));
	}

}
OUTPUT
------
null 100
Apple 10
Kiwi 500
Mango 50
Graphs 6
