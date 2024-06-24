public class Finally {
    public static void main(String args[]){
        try{
            System.out.println("hello");
            int data=30/0;
            System.out.println(data);
           
        }catch(NullPointerException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("finally always executes");
            int i=10;
            int j=20;
            int x=i+j;
            System.out.println(x);
            System.out.println("thankyou");
        }

    }
    
}
