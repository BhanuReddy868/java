public class ArrayIndex {
    public static void main(String args[]){
        try {
            int arr[]={1,2,3,4,5};
            System.out.println(arr[10]);
            
        } catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(e);
        }
        System.out.println("Exceptions throws");
       
    }
    
}
