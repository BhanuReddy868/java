public class StringBufferExample{
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Java Object oriented");
        sb.append("programming language");
        System.out.println(sb);
        sb.insert(5,"is ");
        System.out.println(sb);
        sb.replace(8,14,"programming");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}