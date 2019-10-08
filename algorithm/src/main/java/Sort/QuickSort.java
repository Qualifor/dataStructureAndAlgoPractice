package Sort;

import java.sql.SQLOutput;
import java.util.Arrays;

public class QuickSort {
    public int partition(int nums[], int start, int end){
        int pos = start;
        while(start < end){
            while(start < end && nums[end] >= nums[pos]){
                end--;
            }
            while(start < end && nums[start] <= nums[pos]){
                start++;
            }
            if(start < end){
                nums[start] ^= nums[end];
                nums[end] ^= nums[start];
                nums[start] ^= nums[end];
            }
        }
        if(pos != start){
            nums[pos] ^= nums[start];
            nums[start] ^= nums[pos];
            nums[pos] ^= nums[start];
        }

        return start;
    }

    public void quickSort(int nums[], int start, int end){
        if(start >= end){
            return;
        }
        int pos = partition(nums, start, end);
        System.out.println(Arrays.toString(nums));
        System.out.println("pos:" + pos);
        quickSort(nums, start, pos-1);
        quickSort(nums, pos+1, end);
    }

    public void service(){
        int nums[] = {7,5,6,2,4,3,1};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        new QuickSort().service();
    }
}
