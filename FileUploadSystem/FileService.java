package FileUploadSystem;

    class FileService {
    private StorageManager storage;

    public FileService(StorageManager storage) {
        this.storage = storage;
    }

    public void uploadFile(User user, File file) {
        try {
            if (file.getSize() <= 0) {
                throw new Exception("Invalid file size!");
            }

            if (!storage.hasSpace(file.getSize())) {
                throw new Exception("Storage Full!");
            }

            file.upload();
            storage.store(file.getSize());

            System.out.println("Uploaded by: " + user.getUsername());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
