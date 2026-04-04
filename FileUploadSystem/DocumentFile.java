package FileUploadSystem;

class DocumentFile extends File {

    public DocumentFile(String fileName, double size) {
        super(fileName, size);
    }

    @Override
    public void upload() {
        System.out.println("Uploading Document File: " + getFileName());
    }
}
