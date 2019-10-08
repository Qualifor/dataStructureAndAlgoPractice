package Sort;

import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid+1, end);
        merge(nums, start, mid, end);
    }

    public void merge(int nums[], int start, int mid, int end){
        int start1 = start;
        int start2 = mid+1;
        int temp[] = new int[end-start+1];
        int count = 0;
        while(start1 <= mid && start2 <= end){
            if(nums[start1] < nums[start2]){
                temp[count++] = nums[start1++];
            }else{
                temp[count++] = nums[start2++];
            }
        }
        while(start1 <= mid){
            temp[count++] = nums[start1++];
        }

        while(start2 <= end){
            temp[count++] = nums[start2++];
        }
        count = 0;
        for(int i = start; i <= end;  i++){
            nums[i] = temp[count++];
        }
    }

    public void service(){
        int nums[] = {1,5,3,4,2,7,6};
        mergeSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        new MergeSort().service();
    }
}
