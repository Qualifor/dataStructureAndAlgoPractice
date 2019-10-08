package BackTrace;

import java.util.ArrayList;
import java.util.List;

public class FullPermutation {
    public List<List<Integer>> getAllPermutation(int[] nums){
        boolean used[] = new boolean[nums.length];
        List<Integer> result = new ArrayList<Integer>();
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        dfs(used, nums, result, results);
        return results;
    }

    public void dfs(boolean[] used, int[] nums, List<Integer> result, List<List<Integer>> results){
        if(result.size() == nums.length){
            results.add(new ArrayList<Integer>(result));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!used[i]){
                used[i] = true;
                result.add(nums[i]);
                dfs(used, nums, result, results);
                result.remove(result.size()-1);
                used[i] = false;
            }
        }
    }
}
