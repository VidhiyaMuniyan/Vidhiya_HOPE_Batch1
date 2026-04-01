package Day_10.day_10_task;
class Student {
    private String name;         
    int age;                      
    protected String dept;       
    public String college;        
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Details extends Student {
    public void displayDetails() {
        System.out.println("Name: " + getName()); 
        System.out.println("Age: " + age);         
        System.out.println("Department: " + dept); 
        System.out.println("College: " + college); 
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        Details d = new Details();
        d.setName("Vidhiya");  
        d.age = 20;            
        d.dept = "CSE";        
        d.college = "SJCE";    

        // display
        d.displayDetails();
    }
}