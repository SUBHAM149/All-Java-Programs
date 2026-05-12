import java.util.*;

public class MaxExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 50, 30, 90, 40);

        int max = list.stream()
                      .max(Integer::compare)
                      .get();

        System.out.println("Maximum = " + max);
    }
}
Output
Maximum = 90
