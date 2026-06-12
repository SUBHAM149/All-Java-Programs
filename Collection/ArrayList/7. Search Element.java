7. Search Element
Program
import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        System.out.println(list.contains("Blue"));
    }
}
Output
true
