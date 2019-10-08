import Queue.Queue;
import Queue.LinkedQueue;
import org.junit.Test;

public class TestQueue {
    @Test
    public void queue(){
        Queue queue = new Queue();
        /*queue.add(1);
        queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());*/

        for(int i = 1; i < 11; i++){
            queue.add(i);
        }
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        for(int i = 10; i < 20; i++){
            queue.add(i);
        }
        while(!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
    }
    @Test
    public void testLinkedList(){
        LinkedQueue queue = new LinkedQueue();
        for(int i = 1; i < 100; i++){
            queue.add(i);
        }

        while(!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
        System.out.println();
    }
}
