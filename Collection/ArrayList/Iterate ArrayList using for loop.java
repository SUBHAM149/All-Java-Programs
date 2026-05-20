
import java.util.ArrayList;

public class ForLoopExample {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Hyderabad");
        cities.add("Delhi");
        cities.add("Mumbai");

        for(int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }
    }
}
Output
Hyderabad
Delhi
Mumbai
