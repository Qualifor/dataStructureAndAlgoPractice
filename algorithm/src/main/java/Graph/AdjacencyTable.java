package Graph;

import java.util.Arrays;

public class AdjacencyTable {
    public class Node{
        private int val;
        private int dis;
        private Node next;

        public Node(int val, int dis){
            this.val = val;
            this.dis = dis;
        }
    }

    public Node[] valueGraph(int[] v, int[][] e){
        Node[] array = new Node[v.length+1];

        for(int i = 0; i < e.length; i++){
            int index = e[i][0];
            if(array[index] == null){
                array[index] = new Node(e[i][0], 0);
            }

            Node node = new Node(e[i][1], e[i][2]);
            node.next = array[index].next;
            array[index].next = node;
        }

        return array;
    }

    public void service(){
        int[] v = {1,2,3,4,5,6};
        int[][] e = {{1,3,4}, {1,4,7}, {2,5,1}, {3,6,3}};

        Node[] array = valueGraph(v, e);
        for(int i = 0; i < array.length; i++){
            if(array[i] == null){
                continue;
            }
            if(array[i].next != null){
                System.out.println("顶点为"+array[i].val+"的边如下:");
                while(array[i].next != null){
                    System.out.print("顶点为:"+ array[i].next.val + " 权值为:" + array[i].next.dis);
                    array[i] = array[i].next;
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new AdjacencyTable().service();
    }
}
