public class FinalStatic{
    static final int a;
    static {
        a=100;
    }
    static void demo(){
        a=100;
        System.out.println("a = "+a);
    }
    public static void main(String args[]){
     demo();
    }
}