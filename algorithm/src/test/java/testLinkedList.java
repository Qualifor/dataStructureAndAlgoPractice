import List.CircularLinkedList;
import List.DoublyLinkedList;
import List.LinkedList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class testLinkedList {

    public void mergeTwoList(LinkedList list1, LinkedList list2){

    }

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


        LinkedList list1 = new LinkedList();
        for(int i = 1; i <= 9; i+=2){
            list1.add(i);
        }
        list1.print();
        System.out.println(list1.getMiddle());
        LinkedList list2 = new LinkedList();
        for(int i = 2; i <= 8; i+=2){
            list2.add(i);
        }
        
        list2.print();
        list2.reverseList();
        System.out.println(list2.getMiddle());

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
