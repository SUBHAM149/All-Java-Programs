
import java.util.ArrayList;

public class RemoveElements {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        fruits.remove("Banana");

        System.out.println(fruits);
    }
}
Output
[Apple, Mango]
