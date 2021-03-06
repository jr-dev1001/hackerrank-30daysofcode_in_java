//https://www.hackerrank.com/challenges/30-abstract-classes/problem
import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}
class MyBook extends Book
{// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
    int p;
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    MyBook(String title,String author,int price){
       super(title,author);
       p=price;
    }   
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    void display()
    {
        System.out.print("Title: "+title+"\nAuthor: "+author+"\nPrice: "+p);
    }
    
// End class
}
public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}