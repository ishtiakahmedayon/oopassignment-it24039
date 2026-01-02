class Book {
    String title;
    String author;
    int pages;
    
    void read() {
        System.out.println("Reading: " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Java & OOP Basics";
        book1.author = "Liang Shaheb";
        book1.pages = 250;
        
        Book book2 = new Book();
        book2.title = "OOP Concepts";
        book2.author = "Dr. Ziaur Rahman";
        book2.pages = 180;
        
        book1.read();
        System.out.println("Author: " + book1.author);
        
        book2.read();
        System.out.println("Pages: " + book2.pages);
    }
}
