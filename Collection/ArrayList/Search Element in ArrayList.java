
import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Subham");
        names.add("Raja");
        names.add("Kiran");

        if(names.contains("Raja")) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
Output
Element Found
