import java.util.*;
import java.util.LinkedList;
public class Linkedlist{
    public static void main(String args[]) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("java");
        ll.add("c");
        ll.add(0, "c++");
        ll.add("python");
        ll.addFirst(".Net");
        ll.addLast("React");
        ll.set(0,"Cpp");
        int length = ll.size();
        Iterator<String> i = ll.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("Length of the list is : " + length);
        System.out.println("after deleting first and last elements");
        ll.removeFirst();
        ll.removeLast();
        Iterator<String> i2 = ll.iterator();
        while (i2.hasNext()) {
            System.out.println(i2.next());
        }
    }
}