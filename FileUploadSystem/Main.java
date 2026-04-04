package FileUploadSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String uname = sc.nextLine();
        User user = new User(uname);

        StorageManager storage = new StorageManager();
        FileService service = new FileService(storage);

        System.out.print("Enter number of files: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nFile " + (i + 1));

            System.out.print("Enter type (image/document): ");
            String type = sc.next();

            System.out.print("Enter file name: ");
            String name = sc.next();

            System.out.print("Enter size: ");
            double size = sc.nextDouble();

            File file;

            if (type.equalsIgnoreCase("image")) {
                file = new ImageFile(name, size);
            } else {
                file = new DocumentFile(name, size);
            }

            service.uploadFile(user, file);
        }

        sc.close();
    }
}