package Set;
import java.util.Hashtable;
public class hashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> hash =new Hashtable<>();
        hash.put(1,"java");
        hash.put(2,"c");
        hash.put(3,"javascript");
       // System.out.println(hash.get(2));
       for(Integer i:hash.keySet()){
           System.out.println(i);
       }
       for(String str:hash.values()){
           System.out.println(str);
       }
    }
}
