import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public  static void main(String args[]){
        Queue<String> q=new LinkedList<>();
        q.offer("abc");
        q.offer("def");
        q.offer("ghi");
        q.offer("jkl");
        System.out.println("Queue :"+q);
        String head=q.poll();
        System.out.println("head :"+head);
        head=q.peek();
        System.out.println(head);
    }
}