public class NonStaticBlock {
    private static int x;
    private static int y;
    private static int z;
    {
        x=10;
        y=20;
        z=x+z;
        System.out.println("Non Static blocks executes first");
        System.out.println("sum is: "+z);
    }

    public NonStaticBlock() {
        System.out.println("constructor created");
    }
    public static void main(String args[]){
        NonStaticBlock n= new NonStaticBlock();
        System.out.println("x is: "+x);
        System.out.println("y is :"+y);
    }
}