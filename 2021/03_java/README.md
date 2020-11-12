# How to set up Java (For Windows (x64), updated 11/03/20)
(adoptopenjdk.net link is by the courtesy of our mentor, Jeanne Boyarsky)

You should first check if Java is already installed with step 4 and type in `java --version` into Git Bash and make sure your version is java 11
1. Go here: https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot, and download `OpenJDK 11 (LTS)` with `HotSpot` JVM
2. Run the `OpenJDK11U-jdk_x64_windows_hotspot_11.0.9_11.msi`
    1. Click `Next`
    2. Check the `I accept the terms in the License Agreement` box and click `Next`
    3. Click the box next to `Set JAVA_HOME variable` and click `Entire feature will be installed on local hard drive`
    4. Click `Next` then `Install` and give it permission
3. To check if this worked, open (or reopen) Git Bash and type in `javac` and press `Enter`
4. If command is not found, contact an oldbie and set up a meeting with them.
    * The command is found if Git Bash spits out a bunch of stuff with --

# How to set up Java (for all other operating systems)
Go here: and follow the instruction for you specific operating system: https://adoptopenjdk.net/installation.html?variant=openjdk11&jvmVariant=hotspot (I would recommend you to use the same version and JVM as the one mentioned above)

# Hello, welcome to Java Basics
Slides link: https://docs.google.com/presentation/d/1xhS--sEqA-Y6u4INrUqtSythrm8nzE3HyGasOc0NnVc/edit?usp=sharing

Recording link: https://drive.google.com/file/d/17YB9o5NXTYgFyKwlzl3xSuIz4gPC0aE2/view?usp=sharing

Here's what you will be doing for this exercise (Use the terminal so you can practice)
1. create a folder in 03_java and name it `first_last` (Ex: `pak_lau`)
2. go inside your folder and create a file named `Main.java`(Your file system should match the one in the README for 2021 directory)
3. copy and paste this into your file
```
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```
4. compile and run the code (don't forget to save)
5. create a bunch of variables (of different data types), and print them out
6. using one of the int variables you created, create a for loop where you print the variable and then increment it 10 times.
7. run your code make sure it works, if not, assemble your rubber duckies (group leaders) and bug them to debug with you
8. Now edit that for loop and make it so that it only prints the even numbers
9. repeat step 7
10. push this code onto the github repo, please pull before pushing though

# Discover small nuances of Java
1. What does `System.out.println(5 + "5"); do?`?
2. What would foo be set to if `double foo = 5;`?
3. Would this work `int foo = 5.0;`?
4. What would foo be set to if `5 / 2`?
