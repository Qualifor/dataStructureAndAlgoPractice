package Queue;

import List.LinkedList;

public class LinkedQueue {
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
    }

    private Node head;
    private Node tail;

    public LinkedQueue(){
        head = new Node(-1);
        tail = head;
    }

    public boolean add(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = tail.next;

        return true;
    }

    public int poll(){
        if(isEmpty()){
            System.out.println("队列里没有元素了！！！");
            return -1;
        }
        int val = head.next.val;
        head.next = head.next.next;
        return val;
    }

    public int peek(){
        while(isEmpty()){
            System.out.println("队列里没有元素了！！！");
            return -1;
        }
        return head.next.val;
    }

    public boolean isEmpty(){
        return head.next == null;
    }
}
