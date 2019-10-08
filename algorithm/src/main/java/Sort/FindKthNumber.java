package Sort;

import java.util.Arrays;

public class FindKthNumber {

    public void findKthNumber(int nums[], int start, int end, int k){
        if(start >= end){
            return;
        }

        int pos = partition(nums, start, end);
        if(pos == k-1){
            System.out.println("pos:" + pos);
            System.out.println("第"+k+"大的元素为:" + nums[pos]);
            return;
        }else if(pos < k-1){
            findKthNumber(nums, pos+1, end, k);
        }else{
            findKthNumber(nums, start, pos-1, k);
        }


    }

    public int partition(int nums[], int start, int end){
        int pos = start;

        while(start < end){
            while(start < end && nums[end] <= nums[pos]){
                end--;
            }

            while(start < end && nums[start] >= nums[pos]){
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

    public void service(){
        int[] nums = {1,7,4,5,6,2,3,8};
        findKthNumber(nums, 0, nums.length-1, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        new FindKthNumber().service();
    }
}
