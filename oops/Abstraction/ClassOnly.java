class Car{
    public void start() {
        System.out.println("Car has started");
    }
    public void accelerate(){
        System.out.println("accelerating the car");
    }
    public void brakes() {
        System.out.println("car stopped");
    }
}
 class Bike {
    public void start() {
        System.out.println("bike has started");
    }
    public void accelerate() {
        System.out.println("accelerating the bike");
    }

    public void brakes() {
        System.out.println("bike has stopped");
    }
}
 class Bus {
     public void start() {
         System.out.println("Bus has started");
     }

     public void accelerate() {
         System.out.println("accelerating the bus");
     }

     public void brakes() {
         System.out.println("bus has stopped");
     }
 }

    public class ClassOnly {
        public static void handle(Car c) {
            c.start();
            c.accelerate();
            c.brakes();
        }

        public static void handle(Bike b) {
            b.start();
            b.accelerate();
            b.brakes();
        }

        public static void handle(Bus u) {
            u.start();
            u.accelerate();
            u.brakes();
        }

        public static void main(String args[]) {
            Car c = new Car();
            Bike b = new Bike();
            Bus u = new Bus();
            handle(c);
            System.out.println();
            handle(b);
            System.out.println();
            handle(u);

        }
    }
