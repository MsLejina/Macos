import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);//opening the channel
    System.out.println("Welcome!");

     // System.out.println("Enter the number ");
      int number;
    number = scanner.nextInt();
    System.out.println("This is the provided number: " + number);
   scanner.close();//*closing the channel. It is not gonna use processing power anymore.*//
      
  }
 
 
}
