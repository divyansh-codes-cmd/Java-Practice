// Class: A class is a blueprint used to create objects.
// It defines variables (data) and methods (behaviour).


// 1. Concrete Class: A normal class whose objects can be created.
// Example: class Student { }

// 2. Abstract Class: A class whose objects cannot be created directly.
// Example: abstract class Animal { }

// 3. Final Class: A class that cannot be inherited.
// Example: final class Demo { }

// 4. Static Nested Class: A static class declared inside another class.
// Example: class Outer { static class Inner { } }

// 5. Inner Class: A class declared inside another class.
// Example: class Outer { class Inner { } }

// 6. Anonymous Class: A class without a name, created for a specific use.
// Example: new Thread() { };

/**
 * A clean representation of a Library Book using core Java Class concepts:
 * Fields, Constructor, 'this' keyword, and Methods.
 */

class Book{
    //filed (Properties of Books)
    String title;
    String Author;
    boolean isAvailable;

//constructor
public Book (String title, String Author){
    this.title = title;
    this.Author = Author;
    this.isAvailable = true;
}
//Method 
 public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Success: You borrowed '" + title + "'.");
        } else {
            System.out.println("Sorry: '" + title + "' is already borrowed by someone else.");
        }
    }
 public void returnBook() {
        isAvailable = true;
        System.out.println("Returned: Thank you for returning '" + title + "'.");
    }
  public void displayInfo() {
        String status = isAvailable ? "Available" : "Borrowed";
        System.out.println("Book: " + title + " | Author: " + Author + " | Status: " + status);
    }
}
public class Class {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Book Book2 = new Book("java", "Sun Microsystems");

        book1.displayInfo();

        book1.borrowBook();
        book1.borrowBook();

        book1.returnBook();
        book1.displayInfo();
    }
}


//OUTPUT Only for book1


// Book: Clean Code | Author: Robert C. Martin | Status: Available
// Success: You borrowed 'Clean Code'.
// Sorry: 'Clean Code' is already borrowed by someone else.
// Returned: Thank you for returning 'Clean Code'.
// Book: Clean Code | Author: Robert C. Martin | Status: Available



