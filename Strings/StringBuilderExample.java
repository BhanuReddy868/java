public class StringBuilderExample{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder();
        sb.append("hello");
        System.out.println(sb);
        sb.append("world");
        System.out.println(sb);
        sb.insert(5," ");
        System.out.println(sb);
        int length=sb.length();
        System.out.println(length);
        int capacity=sb.capacity();
        System.out.println(capacity);
        System.out.println("string : "+sb.toString());
    }
}