package Day_7;
class Student{
    String name;
    String rollno;
    Student(String name,String rollno){
        this.name=name;
        this.rollno=rollno;
    }
    void display(){
        System.out.println("Name "+this.name+"\nRoll Number "+this.rollno);
    }

}
public class ThisKeywordExample {
    public static void main(String[] args){
        Student s1=new Student("Tharika","24cs414");
        s1.display();
        System.out.println(s1.hashCode());
        Student s2=new Student("Vidhiya","24cs364");
        s2.display();
        System.out.println(s2.hashCode());

    }
}
