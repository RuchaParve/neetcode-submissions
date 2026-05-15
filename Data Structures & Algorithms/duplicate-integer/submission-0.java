class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mp = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!mp.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
