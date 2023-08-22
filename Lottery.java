import java.util.Scanner;
import java.util.Random;
import java.util.Random;
public class Lottery {
    public static void main(String[] args) {
        boolean gameIsOn = true;
        int winningNumbers[] = new int[3];
        int totalFound = 0;
        int foundNum = 0;

        Scanner sc = new Scanner(System.in);
        int cash = 5;

        System.out.println("\t\tWelcome to our Lottery Stand!");
        System.out.println("\nWhat is your name:");
        String name = sc.nextLine();

        while (gameIsOn) {
            System.out.println("How many tickets would you like to buy, " + name + "?");
            int tickets = sc.nextInt();
            int lotteryArray[][] = new int[tickets][3];
            System.out.println(tickets + " Tickets cost: " + tickets + "₹");
            System.out.println("Are you sure you want to pay " + tickets + "₹? (Y/N)");
            sc.nextLine(); 
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("Y")) {
                if (tickets <= cash) {
                    cash -= tickets;
                    System.out.println("\n\nOK Let's Play");
                    System.out.println("You need to guess 3 numbers from 1-5 in each ticket.\n\tGood Luck!\n");

                    for (int i = 0; i < lotteryArray.length; i++) {
                        System.out.println("Enter three guesses for Ticket number " + (i + 1) + ":");
                        for (int j = 0; j < lotteryArray[0].length; j++) {
                            lotteryArray[i][j] = sc.nextInt();
                            for (int k = 0; k < winningNumbers.length; k++) {
                                if (lotteryArray[i][j] == winningNumbers[k]) {
                                    foundNum++;
                                }
                            }
                        }
                        if (foundNum >= 3) {
                            totalFound++;
                        }
                        foundNum = 0;
                    }
                }

                System.out.println("Your guesses are");
                for (int i = 0; i < lotteryArray.length; i++) {
                    System.out.print("Ticket Number " + (i + 1) + ": ");
                    for (int j = 0; j < lotteryArray[0].length; j++) {
                        System.out.print(lotteryArray[i][j] + " ");
                    }
                    System.out.println();
                }
                Random random = new Random();
                for (int i = 0; i < winningNumbers.length; i++) {
                    winningNumbers[i] = random.nextInt(5) + 1;
                }
                System.out.println("\nThe Lucky Numbers are:");
                for (int i = 0; i < winningNumbers.length; i++) {
                    System.out.print(winningNumbers[i] + " ");
                }
                System.out.println();

                if (totalFound > 0) {
                    System.out.println("Congratulations! You Win: " + totalFound * 100 + "₹ !!!\n");
                } else {
                    System.out.println("\nSorry... Better Luck next time");
                }

                gameIsOn = false;

                if (cash > 0) {
                    System.out.println("You have: " + cash + "₹. Would you like to play again? (Y/N)");
                    sc.nextLine();
                    ans = sc.nextLine();
                    if (ans.equalsIgnoreCase("Y")) {
                        gameIsOn = true;
                    }
                }
            }
        }
    }
}
