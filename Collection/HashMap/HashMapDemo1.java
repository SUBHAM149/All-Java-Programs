package com.sub.hash_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapDemo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Vanilla");
        map.put(2, "ButterScotch");
        map.put(3, "Chocolate");
        map.put(4, "Cotton Candy");

        // toString()
        System.out.println("By Using toString() Method:");
        System.out.println(map);

        System.out.println("................");

        // forEach
        System.out.println("By Using forEach:");
        map.forEach((key, value) ->
                System.out.println("Key is: " + key + " Value is: " + value)
        );

        System.out.println("................");

        // keySet + get()
        System.out.println("Retrieve Value using key:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }

        System.out.println(".................");

        // getOrDefault
        System.out.println("get() & getOrDefault(): ");
        System.out.print("Enter the Key: ");
        int key = sc.nextInt();

        String val = map.getOrDefault(key, "This key is not available.");
        System.out.println("Key " + key + " value is: " + val);

        System.out.println(".....................");

        // containsKey
        System.out.print("Enter Key to search: ");
        key = sc.nextInt();
        System.out.println("Is Key " + key + " available: " + map.containsKey(key));

        // containsValue
        sc.nextLine(); // clear buffer
        System.out.print("Enter Value to search: ");
        String value = sc.nextLine();

        System.out.println("Is Value " + value + " available: " + map.containsValue(value));

        System.out.println("Size of Map: " + map.size());

        System.out.println(".......................");

        // Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
        itr.forEachRemaining(System.out::println);

        System.out.println(".......................");

        // entrySet loop
        System.out.println("Iterating using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}
OUTPUT
-------
By Using toString() Method:
{1=Vanilla, 2=ButterScotch, 3=Chocolate, 4=Cotton Candy}
................
By Using forEach:
Key is: 1 Value is: Vanilla
Key is: 2 Value is: ButterScotch
Key is: 3 Value is: Chocolate
Key is: 4 Value is: Cotton Candy
................
Retrieve Value using key:
Key: 1 Value: Vanilla
Key: 2 Value: ButterScotch
Key: 3 Value: Chocolate
Key: 4 Value: Cotton Candy
.................
get() & getOrDefault(): 
Enter the Key: 3
Key 3 value is: Chocolate
.....................
Enter Key to search: 4
Is Key 4 available: true
Enter Value to search: 1
Is Value 1 available: false
Size of Map: 4
.......................
Iterating using Iterator:
1=Vanilla
2=ButterScotch
3=Chocolate
4=Cotton Candy
.......................
Iterating using entrySet:
1 : Vanilla
2 : ButterScotch
3 : Chocolate
4 : Cotton Candy
