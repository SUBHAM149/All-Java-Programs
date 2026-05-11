import java.util.*;

public class UpperCaseExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("subham", "rahul", "amit");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
Output
SUBHAM
RAHUL
AMIT
