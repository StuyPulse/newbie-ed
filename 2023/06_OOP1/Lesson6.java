public class Lesson6 {
    public static void main(String[] args) {
        Point a = new Point(3, 4);
        Point b = new Point(420, 694);
        Point c = new Point(0, 4);

        Triangle t = new Triangle(a, b, c);
        System.out.println(t.getPerimeter());
        System.out.println(t.getArea());

        Human h = new Human("John", 10, 5);
        System.out.println(h.getNextYear());
        h.changeName("Bob");

        Student s = new Student("John", 10, 5, 1);
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
    double getArea() {
        return 0.5 * Math.abs((a.x - c.x) * (b.y - c.y) - (b.x - c.x) * (a.y - c.y));
    }
}



class Human {
    String name;
    int age;
    int grade;
    public Human(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    int getNextYear() {
        return this.grade + 1;
    }
    void changeName(String newName) {
        this.name = newName;
    }
}

class Student extends Human {
    int seatNumber;
    public Student(String name, int age, int grade, int seatNumber) {
        super(name, age, grade);
        this.seatNumber = seatNumber;
    }
    void about() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Grade: " + this.grade);
        System.out.println("Seat Number: " + this.seatNumber);
    }
}

class Classroom {
    Student[][] students = new Student[5][6];
    public Classroom() {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                students[i][j] = new Student("Student " + i + j, 10, 10, i * 10 + j);
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