package com.sub.hash_map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo5 {

    public static void main(String[] args) {

        HashMap<String, Boolean> library = new HashMap<>();

        library.put("Core Java", true);
        library.put("Advance Java", true);
        library.put("HTML", false);
        library.put("Java Script", true);

        System.out.println("Initial Library..");

        for (Entry<String, Boolean> status : library.entrySet()) {
            System.out.println(status.getKey() + " : " + status.getValue());
        }

        // Book to Borrow
        String bookToBorrow = "Advance Java";

        if (library.containsKey(bookToBorrow) && library.get(bookToBorrow)) {
            library.put(bookToBorrow, false);
            System.out.println(bookToBorrow + " has Borrowed Successfully...");
        } else {
            System.out.println(bookToBorrow + " Book is Not Available for Borrow..");
        }

        // Book to Return
        String bookToReturn = "HTML";

        if (library.containsKey(bookToReturn) && !library.get(bookToReturn)) {
            library.put(bookToReturn, true);
            System.out.println(bookToReturn + " has Returned Successfully..");
        } else {
            System.out.println(bookToReturn + " is already available or not found.");
        }

        // Book to Check
        String bookToCheck = "Java Script";

        if (library.containsKey(bookToCheck)) {
            String availability = library.get(bookToCheck) ? "Available" : "Borrowed";
            System.out.println(bookToCheck + " book is " + availability + ".");
        } else {
            System.out.println(bookToCheck + " is not in the Library..");
        }

        // Final Status
        System.out.println("\nFinal Library Status..");

        for (Entry<String, Boolean> entry : library.entrySet()) {
            String status = entry.getValue() ? "Available" : "Borrowed";
            System.out.println("Book: " + entry.getKey() + ", Status: " + status);
        }
    }
}
OUTPUT
------
Initial Library..
Core Java : true
Advance Java : true
Java Script : true
HTML : false
Advance Java has Borrowed Successfully...
HTML has Returned Successfully..
Java Script book is Available.

Final Library Status..
Book: Core Java, Status: Available
Book: Advance Java, Status: Borrowed
Book: Java Script, Status: Available
Book: HTML, Status: Available
