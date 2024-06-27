class Vehicle1 {
    public void move()
    {
        System.out.println("this vechile should move");
    }
    public void fuel()
    {
        System.out.println("this is petrol vehicle");
    }
}
class Bike1 extends Vehicle1{
    @Override
    public void move()
    {
        System.out.println("This is a bike");

    }
}

class Car1 extends Vehicle1{
    @Override
    public void move(){
        System.out.println("this is a car");
    }

}
public class NormalClass{
    public static void main(String args[]) {
        Vehicle1 b=new Bike1();
        Vehicle1 c=new Car1();
        b.move();
        b.fuel();
        c.move();
        c.fuel();
        Vehicle1 v=new Vehicle1();
        v.move();
        v.fuel();
    }
}
