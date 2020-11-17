import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usersResponse = new Scanner(System.in);
	String usersName;
	Scanner usersColor = new Scanner(System.in);
	String usersFavColor;

	System.out.print("Enter your name: ");
	usersName = usersResponse.nextLine();
	System.out.print("Enter your favorite color: ");
	usersFavColor = usersColor.nextLine();

	System.out.println("Hi " + usersName + "! Your favorite color is " + usersFavColor + "!");
    }
}

