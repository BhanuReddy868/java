public class MultiCatch {
    public static void main(String args[]){
        try{
            int a[]=new int[5];
            a[5]=50/0;


        }catch(ArithmeticException e){
           System.out.println("ArithmeticException is thrown");

    }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("arrayindexoutofbound exception ");

        }
        System.out.println("exceptions are throwed");
    }
    
}
