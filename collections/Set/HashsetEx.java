package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEx {
    public static void main(String[] args) {
        Set<String> hs=new HashSet<>();
        hs.add("java");
        hs.add("cpp");
        hs.add(".net");
        System.out.println(hs);
        Iterator<String> it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
