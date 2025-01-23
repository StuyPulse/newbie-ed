public class Circle {
    private double radius;
    private String color;
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;

    }
    public Circle(double radius){
        this.radius = radius;
        this.color = "Red";
    
    }
    public Circle() {
        this.radius  = 1;
        this.color = "Red";
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color; 
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    public double getCircumference() {
        return Math.PI * 2 * this.radius;
    }


}
