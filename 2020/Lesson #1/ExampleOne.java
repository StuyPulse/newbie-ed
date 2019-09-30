
import java.io.FileWriter;
import java.io.IOException;

class ExampleOne {

    public static void main(String args[]) throws IOException {

        // This is a comment
        // They are green, and dont affect the code

        // Make a number
        double age = 41;
        boolean felon = false;
        String name = "<NEWBIE NAME>";

        System.out.println(name + " is " + age + " Years Old.");


        // Say <NEWBIE NAME> wants to buy a drink
        if (age < 21) {
            System.out.println("It is time for you to go to jail!");

            // Make a double that counts jail time
            double jailTime = 0;

            // Make Newbie Felon
            felon = true;

            // Keep <NEWBIE NAME> in jail until she/he has served their time
            while (jailTime < 25) {
                System.out.println(name + " Has been in jail for " + jailTime + " years!");

                jailTime = jailTime + 1;
                age = age + 1;
            }

        } else {
            System.out.println("Here, Have a Drink!");
        }

        // Make report about Newbie
        FileWriter report = new FileWriter("./report.txt");

        report.write(name + ": \n");
        report.write("age: " + age + "\n");
        report.write("felon: " + felon + "\n");

        report.flush();
    }
}