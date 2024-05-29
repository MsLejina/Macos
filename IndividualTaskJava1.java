import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
   /*  
Medium: Ask for row and column and write in the two dimensional array a value "1" or "2" in the correct place, depending on which players turn it is. Switch the turn after every move.

Check whether or not the row chosen by user contains all 1, or all 2.

Check whether or not the column chosen by user contains all 1, or all 2.

(1 represents X, 2 represents O, 0 represents empty)
    */ 
    int [][] array = new int [3][3];
    Scanner scanner = new Scanner(System.in);
    
      System.out.println("Welcome to the game of Tic Tac Toe!");
      System.out.println("Player 1, please enter your name: ");
      String player1 = scanner.nextLine();
      System.out.println("Player 2, please enter your name: ");
      String player2 = scanner.nextLine();
    
      boolean players1Turn = true; 
      boolean gameOver = false;

//Continue the game until there is a winner. 
      while (!gameOver) {
        printArray(array); 
// Assign number to the players.      
        int number = 0;
        if (players1Turn) {
          number = 1;
          System.out.println(player1 + " it is your turn (1):");
        } else {
          number = 2;
          System.out.println(player2 + " it is your turn (2):");
        } 
          int row = 0;
          int column = 0;
// Checking if the input is valid        
          while (true) {
            System.out.println("Enter a row (0, 1 or 2): ");
            row = scanner.nextInt();
            System.out.println("Enter a column (0, 1 or 2): ");
            column = scanner.nextInt();
            if (row < 0 || column < 0 || row > 2 || column > 2){
              System.out.println("Wrong input! Try again - 0, 1 or 2: "); 
            }else if (array[row][column] != 0){
              System.out.println("This spot is already taken! Try again - 0, 1 or 2: ");
            }else {
              break;
            } 
          }
    
            array[row][column] = number;
// Calling method for checking the winner      
            if(winner(array) ==1) {
              System.out.println("Congratulations, " + player1+ "! You won!");
              gameOver = true;                
            }else if(winner(array) ==2) {
              System.out.println("Congratulations, " +player2 + "! You won!");
              gameOver = true;
            }else {
//Swiching turns              
              players1Turn = !players1Turn;
            } 
           
        }
    printArray(array);
     scanner.close();   
    }
// Method for printing the array    
    public static void printArray(int[][] array){
    System.out.println("-------");
    for (int i = 0; i<3; i++) {
      System.out.print("|");
      for (int j = 0; j<3; j++) {
        System.out.print(array[i][j] + "|");
      }
      System.out.println();
      System.out.println("-------");
    }
  }
// Method for checking the winner- whether or not the row or column contains all 1 or 2 
  public static int winner(int[][] array){
    for (int i = 0; i < 3; i++) {
      if(array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][0] != 0) {
        return array[i][0];
      }
    }
    for (int j = 0; j < 3; j++) {
      if(array[0][j] == array[1][j] && array[1][j] == array[2][j] && array[0][j] != 0) {
        return array[0][j];
      }
    }
    return 0;
  }
}
