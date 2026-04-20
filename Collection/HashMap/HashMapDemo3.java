package com.sub.hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

record Student(Integer id, String name) {
}

public class HashMapDemo3 {

    public static void main(String[] args) {

        HashMap<Integer, String> newmap1 = new HashMap<>();
        HashMap<Integer, String> newmap2 = new HashMap<>();

        newmap1.put(1, "OCPJP");
        newmap1.put(2, " IS ");
        newmap1.put(3, " BEST.");

        newmap2.put(4, " BY ");
        newmap2.put(5, " BY ORACLE.");

        System.out.println("putAll(Map<k,v>) map");
        newmap2.putAll(newmap1);

        System.out.println("Size of newmap2 :" + newmap2.size());
        newmap2.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("Printing all the keys :");
        Set<Integer> allThekeys = newmap2.keySet();
        System.out.println(allThekeys);

        System.out.println("Printing all the values :");
        Collection<String> values = newmap2.values();
        System.out.println(values);

        System.out.println("Loose Coupling");

        HashMap<Student, String> students = new HashMap<>();
        students.put(new Student(1, "Scott"), "Hyd");
        students.put(new Student(2, "Smith"), "Pune");
        students.put(new Student(3, "Allen"), "Indore");

        students.putIfAbsent(new Student(1, "Scott"), "Hyd");

        System.out.println(students.put(new Student(2, "Smith"), "Ameerpet"));

        HashMap<Student, String> studentsMap = new HashMap<>(students);
        studentsMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
OUTPUT
------
putAll(Map<k,v>) map
Size of newmap2 :5
1 : OCPJP
2 :  IS 
3 :  BEST.
4 :  BY 
5 :  BY ORACLE.
Printing all the keys :
[1, 2, 3, 4, 5]
Printing all the values :
[OCPJP,  IS ,  BEST.,  BY ,  BY ORACLE.]
Loose Coupling
Pune
Student[id=3, name=Allen] : Indore
Student[id=2, name=Smith] : Ameerpet
Student[id=1, name=Scott] : Hyd
