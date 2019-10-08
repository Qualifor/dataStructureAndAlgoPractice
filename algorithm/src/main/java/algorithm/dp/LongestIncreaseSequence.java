package algorithm.dp;

import java.util.Arrays;

public class LongestIncreaseSequence {

    public int getLongestValue(int[] nums){
        int max = 0;
        int dp[] = new int[nums.length];
        Arrays.fill(dp, 1);
        //System.out.println(Arrays.toString(dp));

        for(int i = 1; i < nums.length; i++){
            for(int j = i-1; j >= 0; j--){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            if(max < dp[i]){
                max = dp[i];
            }
        }

        return max;
    }

    public void service(){
        int[] nums = {4,5,3,6,12,17,15,4,5,6,7,8,9};

        System.out.println(getLongestValue(nums));
        String str1 = "abcabcdadsaf";
        String str2 = "abfdsafcab";
        Arrays.fill(nums, 1);
    }

    public static void main(String[] args) {
        new LongestIncreaseSequence().service();
    }
}
