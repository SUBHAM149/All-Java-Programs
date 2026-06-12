4. Find Size of ArrayList
Program
import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Size = " + list.size());
    }
}
Output
Size = 4
