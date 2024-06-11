import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<Book>();

    System.out.println("Welcome to the Library!");
 
    while (true){
      System.out.println("Press 1 to borrow a book");
      System.out.println("Press 2 to return a book");
      System.out.println("Press 3 to exit");
      
      int choice = scanner.nextInt();
      scanner.nextLine();
      
      if (choice == 1){

        while (true) {
          System.out.print("Author of the book or 'exit' to quit: ");
          String author = scanner.nextLine();
             
            if (author.equals("exit")) {
                break;
              }
        
          System.out.print("Title of the book you want to borrow: ");
          String title = scanner.nextLine();
           
          books.add(new Book(author, title));
          System.out.println("Book added to the list: " + author + ", " + title);
        }    
        
      } else if (choice == 2){    
           
         while (true) {
           System.out.print("Please enter the book number you want to return or type 'exit' to quit): ");
           String input = scanner.nextLine();
           
            if (input.equals("exit")) {
                 break;
               }
           
           int number = Integer.parseInt(input);
           
            if ( number >= 1 && number <= books.size()) {
              Book removedBook = books.remove(number - 1);
              System.out.println("You have returned: " + removedBook.printBooks());
             
            }else {
             System.out.println("Invalid book number. Plese try again.");
           }                 
         } 
       
       }else if (choice == 3) {
          break;
      }      
    }     
    System.out.println();
    System.out.println("Total number of books you are borrowing: " + books.size());
    System.out.println();
    System.out.println("Books you are borrowing: ");

      int index = 1;
      for (Book book : books) {
        System.out.println(index + ". "+ book.printBooks());
        index++;
      }

    scanner.close();
    
  }
} 


  public class Book {

    private String author;
    private String title;

    public Book( String author, String title){
        this.author = author;
        this.title = title;
    }
  
    public String printBooks() {
      return "Author: " + author + ", Title: " + title;
    }    
  }
