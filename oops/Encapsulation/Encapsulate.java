public class Encapsulate {
    private String name;
    private int age;
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
    public void display(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);
    }
    public static void main(String args[]){
        Encapsulate en=new Encapsulate();
        en.getname();
        en.setname("java");
        en.getage();
        en.setage(23);
        en.display();
    }
}