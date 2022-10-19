package B3_BroCode.DataStructures;
import java.util.*;
public class P3_PriorityQueue {
    public static void main(String args[])
    {
        //Priority Queue = A FIFO data structure that serves elements
        //                             with the highest priorities first
        //				  before elements with lower priority

        //Strings in default order

        Queue<Double> doubleQueue1 = new LinkedList<Double>();

        doubleQueue1.offer(5.0);
        doubleQueue1.offer(1.8);
        doubleQueue1.offer(6.2);
        doubleQueue1.offer(3.5);
        doubleQueue1.offer(4.0);

        while(!doubleQueue1.isEmpty()){
            System.out.println(doubleQueue1.poll());
        }

        //Strings in reverse order
        //Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        Queue<Double> doubleQueue = new PriorityQueue<Double>(Collections.reverseOrder());

        doubleQueue.offer(5.0);
        doubleQueue.offer(1.8);
        doubleQueue.offer(6.2);
        doubleQueue.offer(3.5);
        doubleQueue.offer(4.0);

        while(!doubleQueue.isEmpty()){
            System.out.println(doubleQueue.poll());
        }

        Queue<String> queue = new PriorityQueue<String>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
