//imports the scanner

import java.util.Scanner;

///the main class
public class Main {
    public static void main(String[] args) {

        //Initializes the Scanner
        Scanner in = new Scanner(System.in);


        ///system message
        System.out.println("Choose Rock, Paper, or Scissors. 'r' for rock, 'p' for paper, and 's' for scissors. Type 'x' to end the game");
        System.out.println("***************************************************************************************************************");

        //sets the variables for the scores
        int playerWin = 0;
        int playerLose = 0;

        while (true) {

            ///prints the score (number of wins and losses)
            System.out.println("Wins: " + playerWin + "\t" + "Losses: " + playerLose);
            //System.out.print("Losses: " + playerLose);

            System.out.println("Player's Choice:");


            ///gets the user's move through user input
            String playerChoice = in.nextLine();



            //the program ends when the user types 'x'
            if (playerChoice.equals("x")) {
                System.out.println("Thank you for playing!");
                break;
            }

            ///tells the user if their answer is invalid or not. (if their answer is not r, p, s, or x)
            if (!playerChoice.equals("r") && !playerChoice.equals("p") && !playerChoice.equals("s") && !playerChoice.equals("x")) {

                System.out.println("Your move isn't valid!");

            } else {

                //Gets a random number in between 0 and 3 and converts it to an integer so that the possibilities are 0, 1, or 2
                int rand = (int) (Math.random() * 3);

                //Converts the random number to a string and prints the opponent's move
                String opponentMove = "";
                if (rand == 0) {
                    opponentMove = "rock";
                } else if (rand == 1) {
                    opponentMove = "paper";
                } else {
                    opponentMove = "scissors";
                }


                ///converts the user's input into the word and prints the user's move
                String playerMove = "";
                if (playerChoice.equals("r")) {
                    playerMove = "rock";
                } else if (playerChoice.equals("p")) {
                    playerMove = "paper";
                } else {
                    playerMove = "scissors";
                }


                ///decides the result of the game (tie, win, or lose)
                if (playerMove.equals(opponentMove)) {
                    System.out.println("Draw!");
                } else if ((playerChoice.equals("r") && opponentMove.equals("scissors")) || (playerChoice.equals("s") && opponentMove.equals("paper")) || (playerChoice.equals("p") && opponentMove.equals("rock"))) {
                    System.out.println("You win!");
                    playerWin = playerWin + 1; //adds one point to wins
                } else {
                    System.out.println("You lose!");
                    playerLose = playerLose + 1; //adds one point to losses
                }


                //prints the computer's and player's choice
                System.out.print("Computer Choice: " + opponentMove + "              ");
                System.out.println("Player Choice: " + playerMove + "                   ");
                System.out.println("***************************************************************************************************************");

            }
        }

    }}

