8. Sort ArrayList
Program
import java.util.ArrayList;
import java.util.Collections;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(50);
        list.add(20);
        list.add(40);
        list.add(10);

        Collections.sort(list);

        System.out.println(list);
    }
}
Output
[10, 20, 40, 50]
