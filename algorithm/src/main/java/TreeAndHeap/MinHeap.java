package TreeAndHeap;

import java.util.Arrays;

public class MinHeap {
    private int array[];
    private int count;

    public MinHeap(){
        array = new int[20];
        count = 1;
    }

    public MinHeap(int capacity){
        array = new int[capacity+1];
        count = 1;
    }

    public void push(int val){
        array[count] = val;
        int index = count;
        while(index > 1 && array[index/2] > array[index]){
            array[index/2] ^= array[index];
            array[index] ^= array[index/2];
            array[index/2] ^= array[index];
            index = index/2;
        }
        count++;
    }

    public int peek(){
        return array[1];
    }

    public int pop(){
        int val = array[1];
        array[1] = array[count-1];
        count--;
        int index = 1;

        while(index*2 <= (count-1)){
            int min = 0;
            if(index*2+1 <= (count-1) && array[index*2+1] < array[index*2]){
                min = index*2+1;
            }else{
                min = index*2;
            }

            if(array[min] < array[index]){
                array[index] ^= array[min];
                array[min] ^= array[index];
                array[index] ^= array[min];
                index = min;
            }else{
                break;
            }
        }
        return val;
    }

    public void buildHeap(int[] nums){
        System.out.println(nums.length);
        for(int i = 0; i < nums.length; i++){
            push(nums[i]);
        }
    }

    public void sort(int[] nums){
        buildHeap(nums);
        int index = count-1;
        for(int i = 0; i < nums.length-1; i++){
            array[index] ^= array[1];
            array[1] ^= array[index];
            array[index] ^= array[1];
            index--;
            heapify(index);
         }
    }

    public void heapify(int length){
        int index = 1;

        while(index*2 <= length){
            int min = 0;
            if(index*2+1 <= length && array[index*2+1] < array[index*2]){
                min = index*2+1;
            }else{
                min = index*2;
            }

            if(array[min] < array[index]){
                array[index] ^= array[min];
                array[min] ^= array[index];
                array[index] ^= array[min];
            }else{
                break;
            }
        }
    }

    public void list(){
        for(int i = 1; i < count; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count == 1;
    }
}
