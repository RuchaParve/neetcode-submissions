class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0]; 
        
        return Math.max(helper(nums,1,nums.length),helper(nums,0,nums.length-1));
    }
    
    public int helper(int[] nums,int l,int r){
       int rob1=0,rob2=0;
       int n = nums.length;


       for(int i=l;i<r;i++){
            int temp = Math.max(rob1+nums[i],rob2);
            rob1=rob2;
            rob2=temp;

       } 

       return rob2;
    }
}
