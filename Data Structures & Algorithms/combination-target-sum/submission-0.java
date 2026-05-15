class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> curList = new ArrayList<>();

        helper(curList,nums,0,target);
        return res;

    }

    public void helper(List<Integer> cur,int[] nums,int i, int target){
        if(target==0){
            res.add(new ArrayList(cur));
            return;
        }

        if(target<0 ||  i>=nums.length){
            return;
        } 

        cur.add(nums[i]);
        helper(cur,nums,i,target-nums[i]);
        cur.remove(cur.size()-1);
        helper(cur,nums,i+1,target);
    }


}
