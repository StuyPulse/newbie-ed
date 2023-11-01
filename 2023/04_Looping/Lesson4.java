public class Lesson4 {
    public static void main(String[] args) {
        //Print even numbers 50 down to 0
        for (int i = 50; i >= 0; i-=2) {
            System.out.println(i);
        }

        //Print odd numbers counting up to 100
        for (int i = 1; i <= 100; i+=2) {
            System.out.println(i);
        }

        //Print all the numbers from 1 to (including) 100 BUT
        //If the number is a multiple of 3 print “Stuy”
        //If the number is a multiple of 5 print “Pulse”
        //If the number is a multiple of both print “StuyPulse”
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("StuyPulse");
            }
            else if (i % 3 == 0) {
                System.out.println("Stuy");
            }
            else if (i % 5 == 0) {
                System.out.println("Pulse");
            }
            else {
                System.out.println(i);
            }
        }

        //Use a for loop to compute the sum of integers from 0 to n, where n is some integer greater than 0 in your code
        int sum = 0;
        for (int i = 0, n = 10; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);

        //Bronx Sci
        double[] BronxSci = {80, 56, 97, 78, 86};
        double addedScores = 0;
        for (int i = 0; BronxSci.length > i; i++) {
            addedScores += BronxSci[i];
        }
        double firstMean = addedScores/BronxSci.length;

        for (int i = 0; BronxSci.length > i; i++) {
            if (BronxSci[i] > firstMean) {
                double newScore = BronxSci[i] / 2;
                BronxSci[i] = newScore;
            } else if (BronxSci[i] < firstMean){
                double nScore = BronxSci[i] * 2;
                if (nScore >= 100) {
                    nScore = 100;
                }
                BronxSci[i] = nScore;
            }
        }
        double newAddedScores = 0;
        for (int i = 0; BronxSci.length > i; i++) {
            newAddedScores += BronxSci[i];
        }
        double secondMean = newAddedScores / BronxSci.length;
        System.out.println("Score Average: " + secondMean);

        //Min, Max
        int[] sequence = {1, 2, 3, 4, 5};
        int min = sequence[0];
        int max = sequence[0];
        for(int i = 1; i < sequence.length; i++) {
            if (sequence[i] < min) {
                min = sequence[i];
            }
            if (sequence[i] > max) {
                max = sequence[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

}