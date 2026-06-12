2. Add Elements and Get Element
Program
import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println(list.get(1));
    }
}
Output
Banana
