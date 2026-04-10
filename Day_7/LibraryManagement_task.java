package Day_7;

class Library {
    int libraryId = 101;
    String libraryName = "City Library";

    void displayLibraryDetails() {
        System.out.println("Library Id: " + libraryId);
        System.out.println("Library Name: " + libraryName);
    }
}

class Book {
    int bookId = 201;
    String bookName = "Java Programming";

    void displayBookDetails() {
        System.out.println("Book Id: " + bookId);
        System.out.println("Book Name: " + bookName);
    }
}

class Member {
    int memberId = 301;

    void displayMemberDetails() {
        System.out.println("Member Id: " + memberId);
    }
}