package Day_17;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ComparableImplementation {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 80));

        Collections.sort(students,Collections.reverseOrder()); 
        for (Student student : students) {
            System.out.println(student.name+ ": " + student.rollNo);
        }

    }
}
class Student implements Comparable<Student> {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo); // Sort by roll number
    }
}