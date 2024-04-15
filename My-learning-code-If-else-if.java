public class Main {
  public static void main(String[] args) {

    String season = "Winter";//"Else-if" structure optimises code. Saves time on running code.
    if (season == "Winter") {
      System.out.println("Wear a warm jacket!");
    } else if (season == "Spring") {
      System.out.println("Wear a T-shirt");
    } else if (season == "Summer") {
      System.out.println("Wear a swimming suit");
    } else if (season == "Fall") {
      System.out.println("Wear a raincoat!");
    } else {
      System.out.println("I do not recognize this season!");
    }

    double temp = -10.23;
if (temp <= 5) {
  System.out.println("Wear super warm");
} else if (temp <= 15) {
  System.out.println("Wear warm");
} else if (temp <= 30) {
  System.out.println("Wear normal");
} else {
  System.out.println("You need cooling!");
  }
# This is just an example to show that String messsage needs to be within the scope.
 double temp = -2;
    
if (temp <= 5) {
  String message = "The weather is good outside!"; 
  System.out.println(message);
} else if (temp <= 15) {
  System.out.println(message);
} else if (temp <= 30) {
  System.out.println(message);
} else {
  System.out.println(message);
  }
   
  
  }

}
