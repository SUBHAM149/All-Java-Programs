
import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);

        Collections.sort(numbers);

        System.out.println(numbers);
    }
}
Output
[10, 20, 40, 50]
