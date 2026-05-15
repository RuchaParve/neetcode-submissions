class Solution {
    Set<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        res = new HashSet<>();
        ArrayList<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,0,target,subset);
        return new ArrayList<>(res); 
    }

    public void helper(int[] nums,int sum,int i,int target,List<Integer> subset){
        if(sum==target){
            System.out.println(subset);
            res.add(new ArrayList<>(subset));
            return;
        }
        if(i>=nums.length || sum>target){
            return;
        }

        subset.add(nums[i]);
        helper(nums,sum+nums[i],i+1,target,subset);
        subset.remove(subset.size()-1);
        helper(nums,sum,i+1,target,subset);  
    }


}
