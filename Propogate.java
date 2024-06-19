public class Propogate {
    public static void main(Strings args[]){
            int a=5;
            int b=0;
            try{
                System.out.println("result:" + divide(a,b));

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
           
        }
    }
    private  static int divide(int a, int b){
        return a/b;

    }
   
}
