class Dynamic{
    public void sound(){
        System.out.println("the animal make sounds");
    }

}
class Dog extends Dynamic{
    @Override
    public void sound(){
        System.out.println("bow bow");
    }
}
 class Cat extends Dynamic{
    @Override
    public void sound(){
        System.out.println("meow");
    }
}
public class RunTimePoly{
    public static void main(String args[]){
        Dynamic a=new Dynamic();
        Dynamic d=new Dog();
        Dynamic c=new Cat();
        d.sound();
        c.sound();
        a.sound();
        
    }
}