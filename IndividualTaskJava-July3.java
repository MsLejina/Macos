import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static CheeseShop cheeseShop = new CheeseShop();
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("Press 1 to add a cheese to shop");
            System.out.println("Press 2 to print all the cheese in the shop");
            System.out.println("Press 3 to add a cheese to the cart");
            System.out.println("Press 4 to remove a cheese from the cart");
            System.out.println("Press 5 to view cart");
            System.out.println("Press 6 to checkout");
            System.out.println("Press 7 to exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                addCheese();
            } else if (choice == 2) {
                printCheese();
            } else if (choice == 3) {
                addCheeseToCart();
            } else if (choice == 4) {
                removeCheeseFromCart();
            } else if (choice == 5){
               viewCart();
            } else if (choice == 6) {
                checkout();
            }else if (choice == 7) {
                break;
            }
        }
    }
    public static void addCheese() {
        System.out.println("Enter the id of the cheese: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the name of the cheese: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price of the cheese: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        Cheese cheese = new Cheese(id, name, price);
        cheeseShop.addCheese(cheese);
    }
    public static void printCheese(){
        System.out.println("These are the cheeses in the shop: ");
        ArrayList<Cheese> cheeses = cheeseShop.getAvailableCheeses();
        for (Cheese cheese : cheeses) {
            System.out.println("ID: " + cheese.getId() + ", Name: " + cheese.getName() + ", Price: Eur " + cheese.getPrice());
        }
    }
    public static void addCheeseToCart() {
        System.out.println("Dear Customer, Enter the name of the cheese: ");
        String name = scanner.nextLine();
        Cheese cheese = null;
        for (Cheese availableCheese : cheeseShop.getAvailableCheeses()) {
            if (availableCheese.getName().equalsIgnoreCase(name)) {
                cheese = availableCheese;
                break;
            }
        }
        if (cheese != null) {
            cheeseShop.addCheeseToCart(cheese);
        } else {
            System.out.println("Cheese with name " + name + " not found in the shop.");
        }
    }
    public static void removeCheeseFromCart() {
        System.out.println(" Enter the id of the cheese to remove from cart: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        cheeseShop.removeCheeseFromCart(id);
    }
    public static void viewCart() {
        System.out.println("These are the cheeses in the cart: ");
        ArrayList<Cheese> cheeses = cheeseShop.getShoppingCart();
        for (Cheese cheese : cheeses) {
            System.out.println("ID: " + cheese.getId() + ", Name: " + cheese.getName() + ", Price: Eur " + cheese.getPrice());
        }
    }
         public static void checkout() {
            double totalPrice = cheeseShop.checkout();
            System.out.println("This is your total price Eur: " + totalPrice);
        }
    } 
public class Cheese {
    private int id;
    private String name;
    private double price;

    public Cheese(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

}
import java.util.ArrayList;

public class CheeseShop {

    private ArrayList<Cheese> availableCheeses = new ArrayList<Cheese>();
    private ArrayList<Cheese> shoppingCart = new ArrayList<Cheese>();

    public ArrayList<Cheese> getAvailableCheeses(){
        return availableCheeses;
    }
    public ArrayList<Cheese> getShoppingCart() {
        return shoppingCart;
    }

    public void addCheese(Cheese cheese) {
        availableCheeses.add(cheese);
    }
    public void removeCheese(int id) {
        Cheese cheeseToRemove = null;
        for (Cheese cheese : availableCheeses) {
            if (cheese.getId() == id) {
                cheeseToRemove = cheese;
                break;
            }
        }
        if (cheeseToRemove != null) {
            availableCheeses.remove(cheeseToRemove);
        }    
    }    
    public void updateCheese(int id, String name, double price) {
        for (Cheese cheese : availableCheeses) {
            if (cheese.getId() == id) {
                cheese.setName(name);
                cheese.setPrice(price);
                return;
            }
        }
    }
    public void addCheeseToCart(Cheese cheese) {
        shoppingCart.add(cheese);
    }
    public void removeCheeseFromCart(int id){
        Cheese cheeseToRemove = null;
        for (Cheese cheese : shoppingCart){
            if (cheese.getId() == id) {
                cheeseToRemove = cheese;
                break;
            }
        }
        if (cheeseToRemove != null) {
            shoppingCart.remove(cheeseToRemove);
        }
    }
    public double checkout() {
        double totalPrice = 0;
        for (Cheese cheese : shoppingCart) {
            totalPrice += cheese.getPrice();
        }
        shoppingCart.clear();
        return totalPrice;
    }
}
