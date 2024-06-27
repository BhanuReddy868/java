abstract class Vehicles {
  public abstract void move();
   public void fuel()
    {
      System.out.println("this is petrol vehicle");
    }
  }
class Cars extends Vehicles{
    @Override
    public void move(){
        System.out.println("this is a car");
    }

}
class Bikes extends Vehicles{
    @Override
    public void move(){
        System.out.println("this is a car");
    }

}
public class Main{
public static void main(String args[]) {
    Vehicles b=new Bikes();
    Vehicles c=new Cars();

    b.move();
    b.fuel();
    c.move();
    c.fuel();

}   
}

  