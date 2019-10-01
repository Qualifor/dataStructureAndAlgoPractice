package List;

public class DoublyLinkedList {
    private class Node{
        private int val;
        private Node next;
        private Node prev;
        public Node(){

        }
        public Node(int val){
            this.val = val;
        }
    }
    private Node root;

    public DoublyLinkedList(){
        this.root = new Node();
        root.next = null;
        root.prev = null;
    }

    public boolean add(int val){
        Node node = new Node(val);
        node.prev = root;
        if(root.next != null){
            root.next.prev = node;
        }
        node.next = root.next;
        root.next = node;
        return true;
    }

    public void delete(int val){
        Node node = root;
        while(node.next != null){
            if(node.next.val == val){
                if(node.next.next != null){
                    node.next.next.prev = node;
                }
                node.next = node.next.next;
            }
            if(node.next != null){
                node = node.next;
            }
            //System.out.println("val:"+node.val);
        }
    }

    public void print(){
        Node node = root;
        while(node.next != null){
            System.out.print(node.next.val);
            node = node.next;
        }
        System.out.println();
        while(node != root){
            System.out.print(node.val);
            node = node.prev;
        }
        System.out.println();
    }
}
