public class NestedTry {
    public static void main(String args[]){
        try{
            try{
                int b=30/0;
                System.out.println(b);

            }catch(ArithmeticException e){
                System.out.println(e);

            }
            try{
                int a[]=new int[5];
                a[6]=30;

            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);

            }
            System.out.println("Exception handlings");
        }
    catch(Exception e){
        System.out.println(e);
    }
    System.out.println("thankyou");
}
}

