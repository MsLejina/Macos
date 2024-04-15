public class Main {
  public static void main(String[] args) {

    boolean key1 = true;
    boolean key2 = false;

    if (key1 && key2) {
      System.out.println("The door is open");
    } else {
      System.out.println("The door is closed");
    }

    var username = "Dan-D";
    var password = "ccc";

    if (username=="Dan-D" && password == "123-DD") {
      System.out.println("Welcome, Dan-D!");
    } else {
      System.out.println("Invalid password or username!");
    }

    boolean password1 = true;
    boolean username1 = true;

    if (password1 && username1) {
      System.out.println("You are logged in");
    }else {
      System.out.println("You are not logged in. Try again");
    }
    
boolean onSale = false;
    double eggPrice = 6.50;

    if (onSale || eggPrice < 2.50) {
      System.out.println("Buy the eggs");
    } else {
      System.out.println("Do not buy the eggs");
    }

    boolean enoughEnergy = true;
    boolean weatherShiny = true;

    if (enoughEnergy || weatherShiny) {
      System.out.println("You can go for a run");
          } else {
      System.out.println("Stay at home");      
}
  boolean squid = true;
    boolean shrimp = false;
    boolean whiteWine = true;

    if (whiteWine && (squid || shrimp)) {
      System.out.println("Go to the Restaurant");
      
    } else {
      System.out.println("Stay at home!");
    }

    boolean waitressIsRude = false;

    if (!waitressIsRude) {
      System.out.println("You can go"); 
           
    }else {
      System.out.println("Do not go");
    }

    if (whiteWine && (squid || shrimp) && !waitressIsRude) {
      System.out.println("This restaurant meets your expectations");
    } else {
    System.out.println("You better look for the alternative!");}

      
  }
  
  
  
 
}
