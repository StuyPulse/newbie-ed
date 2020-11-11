public class Main 
{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        numbers();
        words();
    }

    public static void numbers() {
        for (int a = 0; a <= 25; a++) {
            System.out.println(a);
        }

        for (int b = 50; b >= 25; b--) {
            System.out.println(b);
        }
    }

    public static void words() {
        String sentence = "This is a code in Java";
        for (String word : sentence.split(" ")) {
            if (word.length() % 2 == 0) {
               System.out.println(word); 
            }
        }
    }
} 

