public class Lesson5 {
    public static void main(String[] args) {
    }
    // True if even function
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Avg of 3 nums
    public static double avg3(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // Person description function
    public static String personDescription(String name, int age, int grade) {
        return name + " is " + age + " years old and is in grade " + grade;
    }

    // Exponent function
    public static double exponent(double base, int power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }

    // Avg of 3 nums to the nth power
    public static double avg3ToTheNthPower(int a, int b, int c, int n) {
        return exponent(avg3(a, b, c), n);
    }

    // Factorial function
    public static int factorial(int n) {
        for (int i = 0; i < n; i++) {
            n *= i;
        }
        return n;
    }

}