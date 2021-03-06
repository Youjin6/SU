package project;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * This ChutesEC program plays a Chutes & Ladders game with users.
 *
 * @author Youjin Li
 * @version 1.0
 */
public class EC2 {
   /**
    * Call welcome, goodbye and play method and test the game run correctly
    * or not.
    *
    * @param args A string array containing the command line arguments.
    * @throws IOException
    */
   public static void main(String[] args) throws IOException {
      final String WINNER_LIST = "winnerList.txt";
      PrintWriter outputFile = new PrintWriter(WINNER_LIST);
      outputFile.close();


      File file = new File(WINNER_LIST);
      Scanner inputFile = new Scanner(file);
      ArrayList<String> winnerList = new ArrayList<>();
      ArrayList<String> lastTen = new ArrayList<>();

      String winner;
      while (inputFile.hasNext()) {
         winner = inputFile.nextLine();
         winnerList.add(winner);
      }
      for (int i = 0; i < winnerList.size(); i++) {
         lastTen.add(winnerList.get(i));
      }

      String repeat; // holds y or n
      // Create a Scanner object
      Scanner keyboard = new Scanner(System.in);
      // Call welcome method
      welcome();
      // Repeat game as many times as users want
      do {
         // Call play method
         lastTen = play(keyboard, lastTen);
         System.out.println(lastTen.toString());
         System.out.print("\nDo you want to play again?(y/n) ");
         repeat = keyboard.nextLine();
      } while (repeat.equalsIgnoreCase("y"));
      // Call printLine method
      printLine();
      // Call goodbyeMethod
      goodbye();

      // Close Scanner PrintWriter
      outputFile.close();
      keyboard.close();

   }

   /**
    * Prints out a welcome message.
    */
   public static void welcome() {
      System.out.println("\nWelcome to Chutes & Ladders! " +
            "You must land on 100 (without going past) to win! \n" +
            "You will play against the computer.");
   }

   /**
    * Prints out a goodbye message.
    */
   public static void goodbye() {
      System.out.println("\nGoodbye, and thanks for playing Chutes & Ladders!");
   }

   /**
    * Prints out a line
    */
   public static void printLine() {
      System.out.println("\n------------------------------");
   }

   /**
    * Prompts users for the number of players and the players' name.
    *
    * @param keyboard A scanner
    * @return A String list of the player names.
    */
   public static String[] getPlayers(Scanner keyboard) {
      int numOfPlayers; // holds the number of the players
      String userName; // holds the player's name
      int index; // counts the position of an array

      // Call printLine method
      printLine();

      // Prompts users for the number of the users
      System.out.print("\nHow many players will play (between 2-6)? ");
      numOfPlayers = keyboard.nextInt();
      keyboard.nextLine();
      String[] nameList = new String[numOfPlayers];

      // Prompts users for the name of users
      index = 0;
      for (int i = 1; i <= numOfPlayers; i++) {
         System.out.printf("Enter player %d's name: ", i);
         userName = keyboard.nextLine();
         nameList[index++] = userName;
      }

      // Call printLine method
      printLine();
      return nameList;
   }

   /**
    * Rolls the dice
    *
    * @return Steps
    */
   public static int rollDice() {
      final int MAX = 6; // holds the upper bound
      final int MIN = 1; // holds the lower bound

      // Create a Random object
      Random random = new Random();

      // Gets a random dice
      int dice = random.nextInt(1 + MAX - MIN) + 1;
      System.out.println("The spin was: " + dice);
      return dice;
   }

   /**
    * Gets input value from the file
    *
    * @return All the numbers in the file
    * @throws IOException
    */
   public static int[] getBoard() throws IOException {
      final String filename; // holds the filename
      final int ARRAY_SIZE = 38; // holds the size of input number

//      filename = "/home/fac/ohsh/submit/21wq5001/files/p3input.txt";
      filename = "sales.txt";
      int[] board = new int[ARRAY_SIZE];
      int index;

      // Reads the numbers
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      index = 0;
      while (inputFile.hasNext()) {
         board[index++] = inputFile.nextInt();
      }

      // Close the Scanner
      inputFile.close();
      return board;
   }

   /**
    * Gets the location of ladders and chutes from the input array
    *
    * @param inputs The array read from the file
    * @return An array contains the location of ladders and chutes
    */
   public static int[] getLadAndChu(int[] inputs) {
      final int LAD_AND_CHU_ARRAY_SIZE = 19; // hold the la
      final int TWO = 2; // holds the gap for input array

      // Create an array to store the location of ladders and chutes.
      int[] ladderAndChute = new int[LAD_AND_CHU_ARRAY_SIZE];

      // Gets the location
      int index;
      index = 0;
      for (int i = 0; i < inputs.length; i += TWO) {
         ladderAndChute[index++] = inputs[i];
      }
      System.out.println();
      return ladderAndChute;
   }

   /**
    * Gets the forward and backward steps for each ladder and chute
    *
    * @param inputs The array read from the file
    * @return An array contains the forward and backward steps
    */
   public static int[] getMoveSteps(int[] inputs) {
      final int TWO = 2; // holds the gap for input array
      final int STEP_SIZE = 19; // holds the size of array steps

      // Creates a new array to hold the value of each steps
      int[] steps = new int[STEP_SIZE];

      // Adds values to the array
      int index = 0;
      for (int i = 1; i < inputs.length; i += TWO) {
         steps[index++] = inputs[i];
      }
      return steps;
   }

   /**
    * For each step decide take a ladder or chute
    *
    * @param position  current position
    * @param ladAndChu The ladAndChu array holds location of ladders and chutes
    * @param steps     The steps array hold the steps of forward and backward
    * @return current position after take a ladder or chute
    */
   public static int takeLadderOrChute(int position, int[] ladAndChu,
                                       int[] steps) {
      // holds the position of backward
      final int BACKWARD_POSITION = 9;

      // search for each ladders and chute and decide where to go
      for (int i = 0; i < ladAndChu.length; i++) {
         if (position == ladAndChu[i]) {
            position += steps[i];
            if (i >= BACKWARD_POSITION) {
               System.out.printf("Sorry, that is a chute! " +
                     "You are sent back %d spaces.\n", steps[i] * (-1));
            } else {
               System.out.printf("Congrats, that is a ladder! " +
                     "You get to climb %d spaces.\n", steps[i]);
            }
         }
      }
      return position;
   }

   /**
    * Checks if a user reaches 100 point
    *
    * @param currentPosition An array holds the current position of each user
    * @param numPlayers      number of the users
    * @return The win point
    */
   public static int ifWin(int[] currentPosition, int numPlayers) {
      int win; // holds win position
      win = 0; // initialize the win
      for (int i = 0; i < numPlayers; i++) {
         if (currentPosition[i] == 100) {
            win = 100;
         }
      }
      return win;
   }

   /**
    * Plays game between multiple users
    *
    * @param keyboard A Scanner
    * @throws IOException
    */
   public static ArrayList<String> play(Scanner keyboard,
                                        ArrayList<String> lastTen) throws IOException {
      final int WIN_POSITION = 100; // holds winning position
      String[] nameList; // hold the name list
      int spin; // holds the number of dice

      // holds the currentPosition for each users
      int[] currentPosition = new int[6];
      int[] inputs; // holds the input array
      int[] ladAndChu; // holds the array of ladder and chute
      int[] steps; // hold the array of forward and backward steps

      // Call getPlayers method
      nameList = getPlayers(keyboard);

      // Call getInputs method
      inputs = getBoard();

      // Call getLadAndChu method
      ladAndChu = getLadAndChu(inputs);

      // Call getMoveSteps method
      steps = getMoveSteps(inputs);

      // Plays the game until some reach the position 100
      while (ifWin(currentPosition, nameList.length) != WIN_POSITION) {

         // Updates the current position for each user
         for (int i = 0; i < nameList.length; i++) {
            System.out.printf("%s, it's your turn. You are " +
                  "currently at space %d.\n", nameList[i], currentPosition[i]);
            spin = rollDice();
            currentPosition[i] += spin;

            // check out if users reach the win point, goes above 100 or
            // under 100
            if (currentPosition[i] == WIN_POSITION) {
               System.out.println("You are now at space 100.\n");
               System.out.printf("%s, you have won the game!\n", nameList[i]);
               addWinner(nameList[i], lastTen);
               lastTen = displayWinner(lastTen);
               return lastTen;
            } else if (currentPosition[i] > 100) {
               System.out.println("Sorry, no player can go over 100.\n");
               currentPosition[i] -= spin;
            } else {
               currentPosition[i] = takeLadderOrChute(currentPosition[i],
                     ladAndChu, steps);
               System.out.println("You are now at space " +
                     currentPosition[i] + ".\n");
               if (currentPosition[i] == 100) {
                  System.out.printf("%s, you have won the game!\n", nameList[i]);
                  addWinner(nameList[i], lastTen);
                  lastTen = displayWinner(lastTen);
                  return lastTen;
               }
            }
         }
      }
      return lastTen;
   }

   public static ArrayList<String> addWinner(String winner,
                                             ArrayList<String> winnerList) {
      winnerList.add(winner);

      if (winnerList.size() > 1) {
         for (int i = winnerList.size() - 1 - 1; i >= 0; i--) {
            if (winnerList.get(i).equals(winner)) {
               winnerList.remove(i);
            }
         }
      }
      return winnerList;
   }

   public static ArrayList<String> displayWinner(ArrayList<String> winnerList) {
      final int TEN = 10;
      ArrayList<String> lastTen = new ArrayList<>();

      printLine();
      System.out.println("Winner List");
      if (winnerList.size() <= TEN) {
         for (int i = 0; i < winnerList.size(); i++) {
            System.out.println(winnerList.get(i) + " ");
         }
      } else {
         for (int i = winnerList.size() - 1 - TEN; i >= winnerList.size() - 1; i++) {
            lastTen.add(winnerList.get(i));
            System.out.println(lastTen.toString());
         }
      }

      printLine();
      return lastTen;
   }
}