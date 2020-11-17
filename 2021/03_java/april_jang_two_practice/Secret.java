import java.util.Scanner;

public class Secret {
    public static void main(String [] args) {
	Scanner usersInput = new Scanner(System.in);
	String secretWord = "April";
	String guess = "";
	System.out.println("I'm thinking of a word!");
	int guessTrys = 0;
	int guessStop = 3;
	boolean tooMuch = false;

	while (!guess.equals(secretWord) && !tooMuch) {

	    if (guessTrys < guessStop) {

	        System.out.print("Enter a guess: ");
	        guess = usersInput.nextLine();
		guessTrys++;

	    } else  {
		tooMuch = true;
	      }
       }
    }
        if (tooMuch) {

	    System.out.println("You lose, you couldn't guess the word in enough tries!");

      } else {
	  System.out.println("You guess the word correctly!");
        }
}
