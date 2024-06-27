import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQ {
    public static void main(String args[]) {
        Queue<Integer> priority = new PriorityQueue<>();
        priority.offer(20); //priority queue
        priority.offer(10);
        priority.offer(30);
        System.out.println(priority);
        priority.remove(2);

        while (!priority.isEmpty()) {
            System.out.println(priority.poll());
        }
        if (priority.isEmpty()) {
            System.out.println("priority queue is empty:" + priority);
        }
    }
}