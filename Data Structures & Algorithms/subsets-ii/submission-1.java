class Solution {
    HashSet<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> sub = new ArrayList<>();
        res = new HashSet<>();
        Arrays.sort(nums);
        subset(nums,0,sub,res);
        return new ArrayList<>(res);
    }

    public void subset(int[] nums,int i,List<Integer> sub,Set<List<Integer>> res){
        if(i>=nums.length){
            System.out.println(sub);
            res.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[i]);
        subset(nums,i+1,sub,res);
        sub.remove(sub.size()-1);
        subset(nums,i+1,sub,res);

    }
}
