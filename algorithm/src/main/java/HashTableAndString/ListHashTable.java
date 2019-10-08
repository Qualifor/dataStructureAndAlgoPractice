package HashTableAndString;

public class ListHashTable {
    private class Node{
        private int key;
        private int val;
        private Node next;
        public Node(){

        }
        public Node(int key, int val){
            this.val = val;
            this.key = key;
        }
    }

    private Node array[];
    public ListHashTable(){
        array = new Node[10];
        for(int i = 0; i < array.length; i++){
            array[i] = new Node();
        }
    }

    public boolean put(int key, int val){
        int index = key%10;
        //说明该位置未被占用
        if(array[index].val == 0){
            array[index].val = val;
            array[index].key = key;
        }else{
            Node node = new Node(key, val);
            node.next = array[index].next;
            array[index].next = node;
        }

        return true;
    }

    public int get(int key){
        int index = key%10;
        if(index < 0 || index >= 10){
            System.out.println("不存在该key");
            return -1;
        }
        if(array[index].key == key){
            return array[index].val;
        }
        Node node = array[index].next;
        while(node != null){
            //System.out.println("aha?");
            if(node.key == key){
                return node.val;
            }
        }
        System.out.println("不存在该key!!!");
        return -1;
    }
}
