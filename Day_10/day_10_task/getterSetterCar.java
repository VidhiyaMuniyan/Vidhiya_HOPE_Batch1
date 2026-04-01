package Day_10.day_10_task;
class Car {
    private String brand;
    private String model;
    private int year;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
}
public class getterSetterCar {
    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("Toyota");
        c.setModel("Camry");
        c.setYear(2022);
        System.out.println("Car Brand: " + c.getBrand());
        System.out.println("Car Model: " + c.getModel());
        System.out.println("Car Year: " + c.getYear());
    }
}
