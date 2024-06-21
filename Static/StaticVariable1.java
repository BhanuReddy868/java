class StaticVariable1{
    static int a=50;
    String str;
    public static void main(String args[]){
        StaticVariable1 sv=new StaticVariable1();
        StaticVariable1 sv1=new StaticVariable1();
        sv.a=99;// here the static variable is assigned with 99;// later it is overwrriten by second static value
        sv.str="java";
        sv1.a=88;// here the variable is a is assigned to 88 and overwrites the value is first static variable
        sv1.str="hello";
        System.out.println("a is:"+a);
        System.out.println("str is : "+sv.str);
        System.out.println("a is:"+a);
        System.out.println("str is : "+sv1.str);
    }
}