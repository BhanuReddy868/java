import java.util.StringTokenizer;
public class StringTokenize{
    public static void main(String args[]){
        String names="java cpp c html css python";
        StringTokenizer st=new StringTokenizer(names," ");
        while(st.hasMoreTokens()){
        String name=st.nextToken();
        System.out.println(name);
        }
    }
}