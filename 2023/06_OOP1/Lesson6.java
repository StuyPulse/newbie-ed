public class Lesson6 {
    public static void main(String[] args) {
        Point a = new Point(3, 4);
        Point b = new Point(420, 694);
        Point c = new Point(0, 4);
        Triangle t = new Triangle(a, b, c);
        System.out.println(t.getPerimeter());
        System.out.println(t.getArea());

        Human h = new Human("John", 10, 5);
        System.out.println(h.getNextGrade());
        h.changeName("Bob");
        System.out.println(h.name);
         
        Student s = new Student("John", 10, null, 5, 1);
        s.about();

        Classroom classroom = new Classroom();
        classroom.aboutStudents();


    }   
}

//JUST FOR DEMO, THESE ARE IN THE SAME FILE BUT EACH CLASS SHOULD BE ITS OWN FILE
class Point {
    double x;
    double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y; 
    }
    public Point() {
        this.x = 1;
        this.y = 1;
    }
    static double getDistance(Point point, Point toPoint) {
        return Math.sqrt(Math.pow(point.x - toPoint.x, 2) + Math.pow(point.y - toPoint.y, 2));
    }
}


class Triangle {
    Point a;
    Point b;
    Point c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getPerimeter() {
        return Point.getDistance(this.a,this.b) + Point.getDistance(this.b,this.c) + Point.getDistance(this.c,this.a);
    }
    //Heron's formula is used here
    double getArea() {
        return 0.5 * Math.abs((a.x - c.x) * (b.y - c.y) - (b.x - c.x) * (a.y - c.y));
    }
}


class Human {
    String name;
    private int age;
    int grade;
    public Human(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    int getNextGrade() {
        return this.grade + 1;
    }
    void changeName(String newName) {
        this.name = newName;
    }

    // age getters and setters
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int newAge) {
        this.age = newAge;
    }
    //pretend there are also getters and setters for name and grade
}

class Student {
    private String name;
    private int age;
    private String[] classes;
    private int seatNumber;
    public Student(String name, int age, String[] classes, int grade, int seatNumber) {
        this.name = name;
        this.age = age;
        this.classes = classes;
        this.seatNumber = seatNumber;
    }
    void about() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Classes: " + this.classes);
        System.out.println("Seat Number: " + this.seatNumber);
    }
}

class Classroom {
    Student[][] students = new Student[5][6];
    public Classroom() {
        //nested for loop to initialize the 2d array, you need to do this because each element is an object and it is in row i and column j
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                //giving them default values here, but you can also do it in the constructor, notice how the seat number is calculated
                students[i][j] = new Student("", 0, null, 0, i * students[i].length + j);
           }
        }
    } 
    void aboutStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Row " + i);
            for (int j = 0; j < students[i].length; j++) {
                System.out.println("Column " + j);
                students[i][j].about();
            }
        }
    }
}