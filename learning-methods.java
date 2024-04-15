public class Main { //*Methods belong to classes. Class is is like DNA* Cat analogy - DNA gives out instances - run, meaw, breath. So the cat/method will be able to do that*//
 static int sharedValue = 200; //*It must be static.Static means that you can use this value from class/DNA. It is stored at the level in the DNA. Static variable. Already programmed in DNA.*//
  
  public static void main(String[] args) { //*The Main Method.It is the first method to be executed when the programm is run. It is unic and it must be provided. Entry point of the programm. Only one. "Public" means that it is publicly avalable. "Static" - you can run this method without declaring an istance of this class.  " Void" means that this method does this job and does not return any value. Silently does it's job.*//
int mainValue = 14;
    System.out.println(mainValue);
    firstMethod(); // This is how you call a method.
    secondMethod();// *You can also call it from another method, for example firstMethod. Methods are used to help organise the code.*//
 }

  public static void firstMethod () { // *Method1 . The only method which is automathicly run is the main method. Other methods you can definem but you have to call them *//
    int firstValue = 50;
    System.out.println(firstValue);
  }
  public static void secondMethod() {// Method 2
    int secondValue = 120;
    System.out.println(secondValue);
    System.out.println(sharedValue);
  }
  
}
