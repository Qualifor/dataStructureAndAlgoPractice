package TreeAndHeap;

import java.util.BitSet;

public class BinaryTree {
    private class Node{
        private int val;
        private Node left;
        private Node right;

        public Node(int val){
            this.val = val;
        }
    }

    private Node root;
    public BinaryTree(){
    }

    public void add(int val){
        if(root == null){
            root = new Node(val);
            return;
        }
        Node node = root;
        while(node != null) {
            if(node.val == val) {
                break;
            }else if (node.val < val) {
                if (node.right == null) {
                    Node node1 = new Node(val);
                    node.right = node1;
                    return;
                }
                node = node.right;
            } else {
                if (node.left == null) {
                    Node node1 = new Node(val);
                    node.left = node1;
                    return;
                }
                node = node.left;
            }
        }
    }

    /**
     * 首先找到被删除的结点，然后看它又没有左子树，如果有，就找到其左孩子的极右节点
     * 如果被删除结点没有左子树，那么就找到其可以直接删掉该结点，然后将其右子树连接到其父节点上。
     * @param val
     */
    public void delete(int val){
        Node node = root;
        Node before = root;
        while(node != null){
            if(node.val == val){
                if(node.left == null){
                    if(before.val == node.val){
                        root = root.right;
                    }else if(before.val < node.val){
                        //System.out.println("aha?");
                        before.right = node.right;
                    }else{
                        //System.out.println("enheng?");
                        before.left = node.right;
                    }
                }else{
                    int value = findNextRoot(node);
                    node.val = value;
                }
                break;
            }else if(node.val < val){
                before = node;
                node = node.right;
            }else{
                before = node;
                node = node.left;
            }
        }

    }

    private int findNextRoot(Node node){
        Node temp = node.left;
        int val = 0;
        //如果temp.right==null,说明temp已经是极右节点，然后返回其结点的值
        if(temp.right == null){
            val = temp.val;
            node.left = temp.left;
            return val;
        }
        while(temp.right != null && temp.right.right != null){
            temp = temp.right;
        }

        val = temp.right.val;
        temp.right = temp.right.left;

        return val;
    }

    public boolean get(int val){
        Node node = root;
        while(node != null){
            if(node.val == val){
                return true;
            }else if(node.val < val){
                node = node.right;
            }else{
                node= node.left;
            }
        }

        return false;
    }

    public void inorderList(){
        Node node = root;
        inOrderList(node);
        System.out.println();
    }

    public void preorderList(){
        Node node = root;
        preOrderList(node);
        System.out.println();
    }

    public void postorderList(){
        Node node = root;
        postOrderList(node);
        System.out.println();
    }

    private void inOrderList(Node node){
        if(node == null){
            return;
        }

        inOrderList(node.left);
        System.out.print(node.val + " ");
        inOrderList(node.right);
    }

    private void preOrderList(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.val + " ");
        preOrderList(node.left);
        preOrderList(node.right);
    }

    private void postOrderList(Node node){
        if(node == null){
            return;
        }
        postOrderList(node.left);
        postOrderList(node.right);
        System.out.print(node.val + " ");
    }

    /*public int findBefore(int val){
        Node node = root;

    }*/
}
