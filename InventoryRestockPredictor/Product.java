package InventoryRestockPredictor;

public class Product {
    int id;
    String name;
    int stock;
    int dailySales;
    int leadTime;

    public Product(int id, String name, int stock, int dailySales, int leadTime) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.dailySales = dailySales;
        this.leadTime = leadTime;
    }
}
