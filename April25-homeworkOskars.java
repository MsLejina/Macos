```java

import java.util.Scanner;

/*
  Ask user for a title - inputText()
  Ask user for a description - inputText()


  PrintInformation()
    Figure out the size of title
    Print out a border of the size of the title -> printBorder()
    Print out the title
    Print out a border of the size of the title -> printBorder()
    Print out the description
*/


public class Main {
  public static void main(String[] args) {

    //Creating scanner
    Scanner scanner = new Scanner(System.in);

    //Calling method for getting title
    System.out.print("Enter a title: ");
    String title = getText();

    System.out.print("Enter a description: ");
    String description = getText();

    //Calling method to get printout with lines
    getPrintout(title, description);

    //Closing scanner
    scanner.close();
  }

  // Method to ask user for description
  public static String getText() {
    Scanner scanner = new Scanner(System.in);

    //Read user input
    String text = scanner.nextLine();

    //Return user input
    return text;
  }

    // Method to display the result with the title wrapped in = characters + description
/*    

    Figure out the size of title
    Print out a border of the size of the title -> printBorder()
    Print out the title
    Print out a border of the size of the title -> printBorder()
    Print out the description*/
  public static void getPrintout(String title, String description) {

    // Calc length
    int length = title.length();
    // Create top border
    printBorder(length);
    // Display the title
    System.out.print(title);

    System.out.println("");
    // Create bottom border
    printBorder(length);

    // Display the description
    System.out.println("");
    System.out.println(description);

  }

  public static void printBorder(int length){
    for (int i = 0; i < (length); i++) {
      System.out.print("=");
    }
    System.out.println("");
  }
}
```
