6. Traverse Using Enhanced For Loop
Program
import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Hibernate");

        for(String s : list) {
            System.out.println(s);
        }
    }
}
Output
Java
Spring
Hibernate
