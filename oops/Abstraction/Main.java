abstract class Vehicle {
  public abstract void move();
   public void fuel()
    {
      System.out.println("this is petrol vehicle");
    }
  }
class Bike extends Vehicle{
  @Override
  public void move()
  {
    System.out.println("This is a bike");

  }
}

class Car extends Vehicle{
  @Override
   public void move(){
    System.out.println("this is a car");
  }

}
public class Main{
public static void main(String args[]) {
    Vehicle b=new Bike();
    Vehicle c=new Car();

    b.move();
    b.fuel();
    c.move();
    c.fuel();

}   
}

  