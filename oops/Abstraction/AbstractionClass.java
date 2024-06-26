 abstract class Shape{
    public abstract double calculatearea();
    public abstract double calculateperimeter();
}
class Rectangle extends Shape{
    private double length;
    private double breadth;

    public Rectangle(double length,double breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double calculatearea(){
        return length*breadth;
    }
    @Override
    public double calculateperimeter(){
        return 2*(length+breadth);
    }
}
class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatearea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculateperimeter() {
        return 2*Math.PI*radius;
    }
}
public class AbstractionClass {
    public static void main(String args[]){
        Shape s=new Rectangle(100,200);
        Shape s1=new Circle(20);
        System.out.println("area of Rectangle is :"+s.calculatearea());
        System.out.println("perimeter of Rectangle is : "+s.calculateperimeter());
        System.out.println("area of Circle is : " +s1.calculatearea());
        System.out.println("perimeter of Circle is :"+ s1.calculateperimeter());
    }
}
