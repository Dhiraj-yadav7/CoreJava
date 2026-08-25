package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);


        System.out.println(q);

        System.out.println("Removing: " + q.poll());
        System.out.println(q);

        System.out.println("First element : " + q.peek());
        System.out.println(q);



    }
}
