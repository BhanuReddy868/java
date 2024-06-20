
import java.util.Arrays;
import java.util.StringJoiner;

public class ImutableString {
    public static void main(String args[]){
        int n=10;
        boolean m=true;
        String j=String.valueOf(m);
        String i=String.valueOf(n);
        String d="Java is a programming language. Java is a platform. Java is an Island";
        String replaceString=d.replace("Java", "c++");

        String text=new String("hello,array is a object");
        String[] sentence=text.split("\\.");
        StringJoiner b=new StringJoiner(",");
        b.add("hello");
        b.add("world");
        StringBuffer sb=new StringBuffer("sting");
        sb.append("king");
        sb.insert(2, "r");
        sb.replace(6,7,"b");
        sb.reverse();
        StringBuilder a1= new StringBuilder("hello");
        StringBuilder a2= new StringBuilder("world");
        StringBuilder x=a1.append(a2);
        String s="welcome";
        s.concat("home");
        String c=" Hello world ";
        String s1="welcome"+"home";
        String s2=new String("WELCOME");
        String s4=s2.intern();
        String s3="welcome";
        String z=String.format("%s%s",s2,s3);
        String y=String.join("", s2,s3);
        System.out.println(b.toString());
        System.out.println(y.toString());
        System.out.println(z.toString());
        System.out.println(x.toString());
        System.out.println(s1);
        System.out.println(s);
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(c.substring(0, 2));
        System.out.println(Arrays.toString(sentence));
        System.out.println(s.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(c);
        System.out.println(c.trim());
        System.out.println(s.startsWith("we"));
        System.out.println(s.endsWith("me"));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(4));
        System.out.println(s.length());
        System.out.println(s4);
        System.out.println(i+10);
        System.out.println(j+1);
        System.out.println(replaceString);
        System.out.println(sb);
        


    }
    
}
