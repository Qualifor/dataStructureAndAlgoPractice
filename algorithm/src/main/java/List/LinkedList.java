package List;


public class LinkedList {

    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(){

        }
    }
    private Node root;
    public LinkedList(){
        this.root = new Node();
        this.root.next = null;
    }

    public void add(int num){
        Node node = new Node(num);
        node.next = root.next;
        root.next = node;
    }

    public void delete(int num){
        if(root.next == null){
            System.out.println("链表中没有数据，故无法进行删除操作");
            return;
        }
        Node node = root;
        while(node.next != null){
            if(node.next.val == num){
                node.next = node.next.next;
            }
            node = node.next;
            if(node == null){
                break;
            }
        }
    }

    public void print(){
        Node node = root;
        if(node.next == null){
            System.out.println("链表中没有数据!!");
            return;
        }
        node = node.next;
        while(node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void reverseList(){
        if(root.next == null){
            System.out.println("链表为空！！！");
            return;
        }
        //Node node = root.next;
        if(root.next.next == null){
            System.out.println("链表中只有一个元素，无需反转！！");
            return;
        }

        Node node1 = root.next.next;
        root.next.next = null;

        while(node1 != null){
            Node temp = node1.next;
            node1.next = root.next;
            root.next = node1;
            //System.out.println("val:" + root.next.val);
            node1 = temp;
        }
    }

    public int getMiddle(){
        if(root.next == null){
            System.out.println("链表为空!!!");
            return -1;
        }

        if(root.next.next == null){
            System.out.println("链表中只有一个数字");
            return root.next.val;
        }

        Node fast = root.next.next;
        root = root.next;
        while(true){
            root = root.next;
            if(fast.next == null){
                break;
            }

            if(fast.next.next == null){
                break;
            }

            fast = fast.next.next;
        }
        return root.val;
    }
}
