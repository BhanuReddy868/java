class StaticMethod{
    static int num;
    static String str;
    static {
        num=100;
        str ="hello";
    }
    static void display(){
        System.out.println("number is: "+num);
        System.out.println("string is : "+str);
    }
    public static void main(String args[]){
        display();
    }
}