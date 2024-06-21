public class FinalMethod{
    final void sum(){
        int a=5;
        int b=6;
        int c=a+b;
        System.out.println("sum :" +c);
    }
    public class Abc extends FinalMethod {
       void sum() {
            int x = 5;
            int y = 4;
            int z = x + y;
            System.out.println(z);
        }
    }
   public static void main(String args[]){
      Abc f=new Abc();
       f.sum();

   }
}