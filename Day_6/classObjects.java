package Day_6;

class Apartment{
    void display(){
        System.out.println("I am inside the apartment class");
    }

}
public class classObjects {
    public static void main(String[] args){
        System.out.println("I am inside class objects");
        Apartment apartment=new Apartment();
        apartment.display();

    }
}
