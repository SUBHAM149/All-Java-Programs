5. Iterate using Enhanced for loop
import java.util.ArrayList;

public class ForEachExample {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(80);
        marks.add(90);
        marks.add(70);

        for(Integer m : marks) {
            System.out.println(m);
        }
    }
}
Output
80
90
70
