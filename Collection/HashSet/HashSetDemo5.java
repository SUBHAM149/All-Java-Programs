package com.sub.sub.hash_set_demo;

import java.util.HashSet;

public class HashSetDemo5 {

	public static void main(String[] args) {
		HashSet<String> hs1=new HashSet<String>();
        hs1.add("Java");
        hs1.add(new String("Java"));
        IO.println("hs1 size is:"+hs1.size());
        
        HashSet<String> hs2=new HashSet<String>();
        hs2.add(new String("Java"));
        hs2.add(new String("Java"));
        IO.println("hs2 size is:"+hs2.size());
        
        HashSet<StringBuffer> hs3=new HashSet<StringBuffer>();
        hs3.add(new StringBuffer("Java"));
        hs3.add(new StringBuffer("Java"));
        IO.println("hs3 size is:"+hs3.size());
        
	}

}
OUTPUT
------
hs1 size is:1
hs2 size is:1
hs3 size is:2  
