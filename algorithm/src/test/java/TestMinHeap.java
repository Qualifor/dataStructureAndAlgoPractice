import TreeAndHeap.MinHeap;
import org.junit.Test;

import java.util.Arrays;

public class TestMinHeap {
    @Test
    public void testMinHeap(){
        MinHeap heap = new MinHeap();
        //堆排序
        /*heap.push(5);
        heap.push(4);
        heap.push(6);
        heap.push(3);
        heap.push(1);
        heap.push(2);*/

        /*System.out.println(heap.peek());
        System.out.println(heap.pop());
        System.out.println(heap.peek());*/
        /*heap.sort(new int[]{5,1,4,2,3});
        heap.list();*/
        //合并n个有序数组
        /*int a[] = {1,3,5,7,9};
        int b[] = {2,4,6,8};
        int c[] = {10,11,12,13,14,15};

        for(int i = 0; i < a.length; i++){
            heap.push(a[i]);
        }
        for(int i = 0; i < b.length; i++){
            heap.push(b[i]);
        }
        for(int i = 0; i < c.length; i++){
            heap.push(c[i]);
        }


        int result[] = new int[a.length+b.length+c.length];
        System.out.println(heap.size());
        int count = 0;
        while(!heap.isEmpty()){
            //System.out.println(heap.peek());
            //heap.list();
            result[count++] = heap.pop();

        }
        System.out.println(Arrays.toString(result));*/
        //topk
        /*int a[] = {18,24,5,6,4,3,8,7,9,10,15,13,20,14};
        MinHeap top5Heap = new MinHeap(5);

        for(int i = 0; i < 5; i++){
            top5Heap.push(a[i]);
        }

        for(int i = 5; i < a.length; i++){
            if(a[i] > top5Heap.peek()){
                top5Heap.pop();
                top5Heap.push(a[i]);
            }
        }

        top5Heap.list();
*/
    }
}
