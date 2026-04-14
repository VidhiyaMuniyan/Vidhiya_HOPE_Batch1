package InventoryRestockPredictor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Current Stock: ");
        int stock = sc.nextInt();

        System.out.print("Enter Daily Sales: ");
        int dailySales = sc.nextInt();

        System.out.print("Enter Lead Time (days): ");
        int leadTime = sc.nextInt();

        Product p = new Product(id, name, stock, dailySales, leadTime);

        int reorderPoint = InventoryService.calculateReorderPoint(p);

        System.out.println("\nReorder Point: " + reorderPoint);

        if (InventoryService.needRestock(p)) {
            System.out.println("Restock Needed!");
            System.out.println("Restock Amount: " + InventoryService.restockAmount(p));
        } else {
            System.out.println("Stock is sufficient");
        }
        sc.close();
    }
}
