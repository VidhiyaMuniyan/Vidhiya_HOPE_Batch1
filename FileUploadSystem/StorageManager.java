package FileUploadSystem;

class StorageManager {
    private double maxStorage = 1000;
    private double usedStorage = 0;

    public boolean hasSpace(double size) {
        return (usedStorage + size) <= maxStorage;
    }

    public void store(double size) {
        usedStorage += size;
    }
}
