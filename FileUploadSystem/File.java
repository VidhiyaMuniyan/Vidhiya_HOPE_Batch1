package FileUploadSystem;

abstract class File {
    private String fileName;
    private double size;

    public File(String fileName, double size) {
        this.fileName = fileName;
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public double getSize() {
        return size;
    }

    public abstract void upload();
}
