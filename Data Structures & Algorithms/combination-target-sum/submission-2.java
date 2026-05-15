class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();

        helper(nums,0,0,target,subset);
        return res; 
    }

    public void helper(int[] nums,int sum,int i,int target,List<Integer> subset){
        if(sum==target){
            res.add(new ArrayList<>(subset));
            return;
        }
        if(i>=nums.length || sum>target){
            return;
        }
        System.out.println(subset);
        subset.add(nums[i]);
        helper(nums,sum+nums[i],i,target,subset);
        subset.remove(subset.size()-1);
        helper(nums,sum,i+1,target,subset);  
    }


}
