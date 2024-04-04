package assignment12;



class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void updateBookInfo(User user, String newTitle, String newAuthor, String newIsbn) {
        if (user != null && user.login("admin", "adminpassword")) { 
            this.title = newTitle;
            this.author = newAuthor;
            this.isbn = newIsbn;
            System.out.println("Book information updated successfully.");
        } else {
            System.out.println("Unauthorized access. Please login as admin to update book information.");
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + isbn;
    }
}

public class UnAuthorized {
    public static void main(String[] args) {
        User adminUser = new User("admin", "adminpassword");
        User regularUser = new User("user", "password");

        Book book = new Book("Java Programming", "John Doe", "1234567890");
        book.toString();

        
book.updateBookInfo(regularUser, "New Title", "New Author", "New ISBN");
        
        
        System.out.println("\nBook Information after Unauthorized Update Attempt:");
        System.out.println(book.toString());


        book.updateBookInfo(adminUser, "Java Programming", "Jhone", "23432525325");
        
        
        System.out.println("\nBook Information after Authorized Update:");
        System.out.println(book.toString());
    }
    }