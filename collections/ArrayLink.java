import java.util.LinkedList;
import java.util.ArrayList;
import java.util.*;

public class ArrayLink{
    public static void main(String args[]){
        LinkedList<String> ll=new LinkedList<>();
        ArrayList<String> ar=new ArrayList<>();
        ar.add("String1");
        ar.add("String2");
        ar.add("String3");
        ar.add("String4");
        ar.add("String5");

        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        ll.add("five");
     /*   Iterator<String> ir=ll.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
        }*/
        ll.addAll(4,ar);
        System.out.println(ll);

    }
}