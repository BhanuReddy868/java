final class FinalClass{

    }
 class Xyz extends FinalClass{
    void demo(){
        System.out.println("hello");
    }
public static void main(String args[]){
    Xyz x=new Xyz();
    x.demo();
}
}