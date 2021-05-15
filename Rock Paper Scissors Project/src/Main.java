//imports the scanner
import java.util.Scanner;

///the main class
public class Main {
    public static void main(String[] args) {

        //Initializes the Scanner
        Scanner in = new Scanner(System.in);

        ///system message
        System.out.print("Choose Rock, Paper, or Scissors. 'r' for rock, 'p' for paper, and 's' for scissors. ");

        ///gets the user's move through user input
        String playerChoice = in.nextLine();

        ///tells the user if their answer is invalid or not. (if their answer is not r, p, or s)
        if(!playerChoice.equals("r") && !playerChoice.equals("p") && !playerChoice.equals("s")) {

            System.out.println("Your move isn't valid!");

        } else {

            //Gets a random number in between 0 and 3 and converts it to an integer so that the possibilities are 0, 1, or 2
            int rand = (int)(Math.random()*3);

            //Converts the random number to a string and prints the opponent's move
            String opponentMove = "";
            if(rand == 0) {
                opponentMove = "rock";
            } else if(rand == 1) {
                opponentMove = "paper";
            } else {
                opponentMove = "scissors";
            }


            ///converts the user's input into the word and prints the user's move
            String playerMove = "";
            if(playerChoice.equals("r")){
                playerMove = "rock";
            }
            else if(playerChoice.equals("p")){
                playerMove = "paper";
            }
            else {
                playerMove = "scissors";
            }


            ///decides the result of the game (tie, win, or lose)
            if(playerMove.equals(opponentMove)) {
                System.out.println("It's a tie!");
            } else if((playerChoice.equals("r") && opponentMove.equals("scissors")) || (playerChoice.equals("s") && opponentMove.equals("paper")) || (playerChoice.equals("p") && opponentMove.equals("rock"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lost!");
            }


            //prints the computer's and player's choice
            System.out.print("Computer Choice: " + opponentMove + "              ");
            System.out.print("Player Choice: " + playerMove + "                   ");

        }
    }

}

