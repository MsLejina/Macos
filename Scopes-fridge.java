
public class Main {
  public static void main(String[] args) {
System.out.println("Let's go and check out the fridge!");//this will run always
      boolean isFridgeOpen = false; // Fridge is closed
    
    String result; //* We reserve a memory, we do not know what is inside yet, but we now, it's going to be string. Now it is empty. You have to declare the data type, you cannot write "var" instead of "String" -because you have to reserve certayn amount of memory, In this time"we need a box to store strings":)*//

    
    if(isFridgeOpen) {
      String item1 = "Cheese";
      String item2 = "Milk";
      String item3 = "Eggs";
      result = item1 + item2 + item3;
        } else {//the fridge is closed, this code will be executed
      result = "Fridge is closed, open the fridge!";
        }
    System.out.println(result);//* You cannot put here item1 - System.out.println(item1); - because it is decleared out of scope. You can use " item1 only in the if scope*//

 }
}
