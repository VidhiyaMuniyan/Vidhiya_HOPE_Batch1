package FileUploadSystem;

class ImageFile extends File {

    public ImageFile(String fileName, double size) {
        super(fileName, size);
    }

    @Override
    public void upload() {
        System.out.println("Uploading Image File: " + getFileName());
    }
}
