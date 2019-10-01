package List;

public class CircularLinkedList {
    private class Node{
        private int val;
        private Node next;
        public Node(){

        }
        public Node(int val){
            this.val = val;
        }
    }
    private Node root;
    public CircularLinkedList(){
        this.root = new Node();
        this.root.next = root;
    }

    public boolean add(int num){
        Node node = new Node(num);
        node.next = root.next;
        root.next = node;

        return true;
    }

    public boolean delete(int num){

        Node node = root;
        boolean flag = false;
        while(node.next != root){
            if(node.next.val == num){
                node.next = node.next.next;
                flag = true;
            }
            node = node.next;
        }
        if(!flag){
            return false;
        }
        return true;
    }

    public void print(){
        Node node = root;
        while(node.next != root){
            System.out.print(node.next.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
