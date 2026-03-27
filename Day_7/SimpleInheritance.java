package Day_7;
class Parent{
    void display(){
        System.out.println("inside parent class but called by child class");
    }
}
class Child extends Parent{
    void display1(){
        System.out.println("inside child class");
    }
}
public class SimpleInheritance {
    public static void main(String[] args){
        System.out.println("Inside main function ");
        Child c=new Child();
        c.display();
    }
}
