12. Find Sum of Elements in ArrayList
Program
import java.util.ArrayList;

public class SumArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int sum = 0;

        for(Integer num : list) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}
Output
Sum = 100
