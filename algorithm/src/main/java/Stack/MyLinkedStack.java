package Stack;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import org.omg.IOP.ExceptionDetailMessage;

public class MyLinkedStack {
    private class Node{
        private int val;
        private Node next;
        private Node prev;
        public Node(int val){
            this.val = val;
        }
    }

    private Node root;
    private int length;

    public MyLinkedStack(){
        root = new Node(-1);
        length = 0;
    }

    public boolean push(int val){
        Node node = new Node(val);
        root.next = node;
        node.prev = root;
        root = node;
        return true;
    }

    public int pop(){
        if(root.prev == null) {
            throw new ArrayIndexOutOfBoundsException(-1);
        }
        int result = root.val;
        root = root.prev;
        return result;
    }

    public int peek(){
        if(root.prev == null) {
            throw new ArrayIndexOutOfBoundsException(-1);
        }
        return root.val;
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return root.prev == null;
    }
}
