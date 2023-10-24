public class Lesson3 {
    public static void main(String[] args) {

        //Area of Triangle 
        //@THIS IS HOW YOU CAN MAKE MULTIPLE VARAIBLES OF THE SAME DATATYPE IN ONE LINE
        int base = 10, height = 10; 
        System.out.println(0.5 * base * height);

        //Farenheit to Celsius 
        int f = 32;
        double toC = (f - 32) * 9. / 5;
        // @THIS IS HOW YOU CAN GET A FORMATTED STRING:
        // make each %s a placeholder in the text for each variable you plan to insert there
        // enter each argument in order of the variable you plan to put in there
        // for futher readers: https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-format-a-Java-String-with-printf-example 
        System.out.printf("Converting %s Fahrenheit is %S Celsius. \n", f, toC);

        //Comparing Greater of Two Values 
        int val1 = 10, val2 = 11;
        if (val1 > val2) {
            System.out.println("val1 is greater than val2");
        } else {
            System.out.println("val 1 is not greater than val2");
        }

        //Is Leap Year?
        int year = 2020;
        //@If you put the conditonal in a boolean variable since you only need true/false, you won't even need a if statement!
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); 
        System.out.println(isLeapYear);

        //Using someone’s grade (ex. 9, 10, 11, 12) print out what math class someone should be taking
        int grade = 9;
        if (grade == 9) {
            System.out.println("Geometry");
        } else if (grade == 10) {
            System.out.println("Algebra 2");
        } else if (grade == 11) {
            System.out.println("Pre-Calculus");
        } else if (grade == 12) {
            System.out.println("Calculus");
        } else {
            System.out.println("You are not in high school");
        }

        //You are writing a grade fixing program to help [insert horrible rival school] (BronxSci) students compete with your school! 
        //Given an array that contains 5 integer scores, calculate the mean after the following changes: 
        //any grade above average gets cut in half. 
        //Any grade below average gets doubled, but has a maximum of 100.
        int[] grades = { 50, 60, 70, 80, 90};
        int average1 = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / grades.length;
        if (grades[0]>average1){
            grades[0]=grades[0]/2;
        } else if (grades[0]<average1){
            grades[0]=grades[0]*2;
            if(grades[0]>100) {
                grades[0]=100;
            }}
        if (grades[1]>average1){
            grades[1]=grades[1]/2;
        } else if (grades[1]<average1){
            grades[1]=grades[1]*2;
            if(grades[1]>100) {
                grades[1]=100;
            }}
        if (grades[2]>average1){
            grades[2]=grades[2]/2;
        } else if (grades[2]<average1){
            grades[2]=grades[2]*2;
            if(grades[2]>100) {
                grades[2]=100;
            }}
        if (grades[3]>average1){
            grades[3]=grades[3]/2;
        } else if (grades[3]<average1){
            grades[3]=grades[3]*2;
            if(grades[3]>100) {
                grades[3]=100;
            }}
        if (grades[4]>average1){
            grades[4]=grades[4]/2;
        } else if (grades[4]<average1){
            grades[4]=grades[4]*2;
            if(grades[4]>100) {
                grades[4]=100;
            }
        }
        double average2 = ((grades[0]+grades[1]+grades[2]+grades[3]+grades[4])*0.2);
        System.out.println("The new average is " + average2 + ".");
        //@CREDIT TO ETHAN ZHANG FOR THIS SOLUTION

        //Given an array of 5 integers, find the minimum and maximum values in the array. 
        //Hint: Math.min(a,b) and Math.max(a,b) returns the minimum and maximum of the two parameters
        int[] numbers = { 1, 2, 3, 4, 5 };
        //@ you can compare the min of the first two numbers, then the min of the next two numbers, and so on like so 
        int min = Math.min(numbers[0], Math.min(numbers[1], Math.min(numbers[2], Math.min(numbers[3], numbers[4]))));
        int max = Math.max(numbers[0], Math.max(numbers[1], Math.max(numbers[2], Math.max(numbers[3], numbers[4]))));
        System.out.printf("The min is %s and the max is %s", min, max);

        //Optional HW answer
        int start = 0, end = 3;
        System.out.println(solution(start, end));
    }

    //Function answer for HW
    static int solution(int start, int end) {
        int difference = (end - start), jumps;
        if (difference % 3 == 0) return difference / 3;
        else                     return (difference / 3) + (difference % 3);
    }
}