package InventoryRestockPredictor;

public class InventoryService {
    public static int calculateReorderPoint(Product p) {
        return p.dailySales * p.leadTime;
    }
    public static boolean needRestock(Product p) {
        int reorderPoint = calculateReorderPoint(p);
        return p.stock <= reorderPoint;
    }
    public static int restockAmount(Product p) {
        int targetStock = p.dailySales * (p.leadTime + 5); 
        return targetStock - p.stock;
    }
}
