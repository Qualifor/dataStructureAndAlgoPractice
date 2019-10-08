import TreeAndHeap.BinaryTree;
import org.junit.Test;

public class TestBinaryTree {
    @Test
    public void testBinaryTree(){
        BinaryTree root = new BinaryTree();
        root.add(10);
        root.add(9);
        root.add(4);
        root.add(3);
        root.add(1);
        root.add(5);
        root.add(6);
        root.add(12);
        root.add(14);
        root.add(11);

        /**
         *              10
         *          9        12
         *       4      11         14
         *    3    5
         * 1           6
         */


        /*root.add(1);
        root.add(1);
        root.add(8);*/
        /*root.inorderList();
        root.delete(9);
        root.inorderList();*/
        root.preorderList();
        root.inorderList();
        root.postorderList();

        /*for(int i = 1; i <= 14; i++){
            root.inorderList();
            root.delete(i);
        }*/

    }

}
