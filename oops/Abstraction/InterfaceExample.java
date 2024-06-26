interface Vehicle{
     void start();
     void accelerate();
     void brakes();
}
class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car has started");
    }
    @Override
    public void accelerate(){
        System.out.println("accelerating the car");
    }

    @Override
    public void brakes() {
        System.out.println("car stopped");
    }
}
class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("bike has started");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerating the bike");
    }

    @Override
    public void brakes() {
        System.out.println("bike has stopped");
    }
}
class Bus implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bus has started");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerating the bus");
    }

    @Override
    public void brakes() {
        System.out.println("bus has stopped");
    }
}
public class InterfaceExample {
    public static void handle(Vehicle v){
        v.start();
        v.accelerate();
        v.brakes();
    }
    public static void main(String args[]){
        Car c=new Car();
        Bike b=new Bike();
        Bus u=new Bus();
        handle(c);
        handle(b);
        handle(u);
    }
}
