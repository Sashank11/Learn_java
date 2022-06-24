import java.util.*;
public class QueueCollections {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>(); // as the Queue class is actually an interface.
        queue.add(10);
        queue.add(20);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}
