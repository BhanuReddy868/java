class StaticVariable{
    static int num;
    static String str;
    static void display(){
        System.out.println("number is :"+num);
        System.out.println("string str :"+str);
    }
    public static void main(String args[]){
        display();
    }
}