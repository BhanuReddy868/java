public class  Car{
    String  name;
    String model;
    int year;
void drive(){
    System.out.println("the car is driving");
}
void displayInfo(){
    System.out.println("name :" +name);
    System.out.println("model :" +model);
    System.out.println("year :" +year);
}public static void main(String args[]){
    Car c=new Car(); // object c is refernece class Car ,c is a refernce variable holds the address of the "Car"
                    // new keyword is used to create instance of the class which is used to allocate the memory 

    c.name="honda";
    c.model="city";
    c.year=2020;
    c.drive();
    c.displayInfo();
}
}