package com.sub.link_list;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListDemo4 {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLinked List: " + linkedList);
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter the element to add: ");
                    int elementToAdd = Integer.parseInt(scanner.nextLine());
                    linkedList.add(elementToAdd);
                    System.out.println(elementToAdd + " added successfully...");
                }

                case 2 -> {
                    if (linkedList.isEmpty()) {
                        System.out.println("LinkedList is empty, nothing to delete.");
                        break;
                    }

                    System.out.print("Enter the element to delete: ");
                    int elementToDelete = Integer.parseInt(scanner.nextLine());

                    boolean isDeleted = linkedList.remove(Integer.valueOf(elementToDelete));

                    if (isDeleted) {
                        System.out.println(elementToDelete + " deleted successfully...");
                    } else {
                        System.out.println(elementToDelete + " element not found.");
                    }
                }

                case 3 -> {
                    System.out.println("Elements in LinkedList:");
                    linkedList.forEach(System.out::println);
                }

                case 4 -> {
                    System.out.println("Exiting the program...");
                    return; // stops loop
                }

                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
OUTPUT
------
Linked List: []
1. Insert Element
2. Delete Element
3. Display Elements
4. Exit
Enter Your Choice: 1
Enter the element to add: 20
20 added successfully...

Linked List: [20]
1. Insert Element
2. Delete Element
3. Display Elements
4. Exit
Enter Your Choice: 1
Enter the element to add: 30
30 added successfully...

Linked List: [20, 30]
1. Insert Element
2. Delete Element
3. Display Elements
4. Exit
Enter Your Choice: 1
Enter the element to add: 30
30 added successfully...

Linked List: [20, 30, 30]
1. Insert Element
2. Delete Element
3. Display Elements
4. Exit
Enter Your Choice: 1
Enter the element to add: 40
40 added successfully...

Linked List: [20, 30, 30, 40]
1. Insert Element
2. Delete Element
3. Display Elements
4. Exit
Enter Your Choice: 1
Enter the element to add: 40
40 added successfully...

Linked List: [20, 30, 30, 40, 40]
1. Insert Element
2. Delete Element
3. Display Elements
4. Exit
Enter Your Choice: 3
Elements in LinkedList:
20
30
30
40
40

Linked List: [20, 30, 30, 40, 40]
1. Insert Element
2. Delete Element
3. Display Elements
4. Exit
Enter Your Choice: 2
Enter the element to delete: 40
40 deleted successfully...

Linked List: [20, 30, 30, 40]
1. Insert Element
2. Delete Element
3. Display Elements
4. Exit
Enter Your Choice: 3
Elements in LinkedList:
20
30
30
40

Linked List: [20, 30, 30, 40]
1. Insert Element
2. Delete Element
3. Display Elements
4. Exit
Enter Your Choice: 4
Exiting the program...
