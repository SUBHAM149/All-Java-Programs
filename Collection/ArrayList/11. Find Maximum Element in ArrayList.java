11. Find Maximum Element in ArrayList
Program
import java.util.ArrayList;
import java.util.Collections;

public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(50);
        list.add(30);
        list.add(70);
        list.add(20);

        int max = Collections.max(list);

        System.out.println("Maximum Element = " + max);
    }
}
Output
Maximum Element = 70
