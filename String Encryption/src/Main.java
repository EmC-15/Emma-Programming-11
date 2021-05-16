import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //initializes the scanner

        System.out.println("Enter a word"); //prints the program message

        String userWord = scan.nextLine(); //gets the user's input

        char last = userWord.charAt((userWord.length() -1)); //takes the last letter of user input

        String newWord = userWord.substring(0, userWord.length() - 1);

        System.out.println(last + newWord + "ay");

        char last2 = newWord.charAt(0);

        String newWord2 = newWord.substring(1, newWord.length() - 0) + userWord.charAt(userWord.length() - 1);

        System.out.println(last2 + newWord2);

    }
}
