import List.CircularLinkedList;
import List.DoublyLinkedList;
import List.LinkedList;
import org.junit.Test;

public class testLinkedList {
    @Test
    public void test(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(6);
        //list.delete(1);
        list.print();

        list.delete(2);
        list.print();

        list.reverseList();
        list.print();

    }

    @Test
    public void circularLinkedList(){
        CircularLinkedList list = new CircularLinkedList();
        list.add(2);
        list.add(3);
        list.print();
        list.delete(2);
        list.print();
        list.delete(3);
        list.print();
    }

    @Test
    public void doublyLinkedList(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.print();
        list.delete(4  );
        list.print();
    }
}
