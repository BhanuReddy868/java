public class FinalMethod1{
     /*final*/ void sum(){
        int a=5;
        int b=6;
        int c=a+b;
        System.out.println("sum :" +c);
    }
    public class Abc1 extends FinalMethod1 {
      public void sum() {
            int x = 5;
            int y = 4;
            int z = x + y;
            System.out.println(z);
        }
    }
   public static void main(String args[]){
      FinalMethod1 f1=new FinalMethod1();
      FinalMethod1 f=f1.new Abc1();
       f.sum();


   }
}