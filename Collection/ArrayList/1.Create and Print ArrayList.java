1. Create and Print ArrayList
Program
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Spring");

        System.out.println(list);
    }
}
Output
[Java, Python, Spring]
