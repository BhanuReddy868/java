
public class JavaException {
    public static void main(String args[]){
         int i=50;
         int j=0;
         int data;
         try {
         data=i/j;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.err.println(i/(j+2));
    }
    
}
