public class StaticBlock{
    static int num;
    static String str;
    static{
        System.out.println("Static block 1"); //the values are overwritten by the second static blocks and prints the values of second static block
        num=100;
        str="java";
    }
    static {
        System.out.println("static block 2");
        num=101;
        str="python";
    }
    public static void main(String args[]){
        System.out.println("number is:"+num);
        System.out.println("String is :"+str);


    }
}