10. Student Object in ArrayList
Program
import java.util.ArrayList;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Demo10 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Rahul"));
        list.add(new Student(102, "Amit"));

        for(Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
Output
101 Rahul
102 Amit
