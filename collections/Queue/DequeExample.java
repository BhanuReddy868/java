import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
public class DequeExample {
    public static void main(String args[]) {
        Deque<String> d=new ArrayDeque<>();
        d.offer("java");
        d.offer("c++");
        d.offer("c");
        d.offer("python");
        d.offerFirst("javascript");
        d.offerLast(".net");
        d.pollFirst();
        d.pollLast();
        d.remove("c");
        System.out.println(d);

    }
    }