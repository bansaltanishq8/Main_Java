package Programming_Challenges;
import java.util.Scanner;
public class Book {
    static int total;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static{
        total = 0;
    }
    {
        total++;
    }
    Book (String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;

    }
    Book (String isbn){
        this(isbn, "Unknown" , "Unknown");

    }
    static int GetTotalNoOfBooks() {
        return total;
    }
    void Borrowbook(){
        if(isBorrowed) {
            System.out.println("Book is already borrowed!");
        }
        else {
            this.isBorrowed = true;
            System.out.println("Enjoy ht ");
        }
    }
    void ReturnBook() {
         if (isBorrowed) {
         this.isBorrowed = false;
             System.out.println("Hope you enjoyed the book, Please leave a Review!!");
         }


    }

}







