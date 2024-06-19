public class Throws1 {
        public static void main(String args[]){
            int a=6;
            int b=0;
            try{
            System.out.println("result :"+divide(a,b));
        }catch(Exception e){
            System.out.println(e);
        }
    }
        private static int divide(int a,int b) throws IllegalArgumentException,IllegalAccessException
        {

            if(b==0){
                throw new IllegalArgumentException("second argument cannot be zero");
    
            }
            return a/b;
        }
        
    }
    
