class Solution {
    private ArrayList<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> cur = new ArrayList<>();
        dfs(nums,cur,set);  
        return res;
    }

    private void dfs(int[] nums,List<Integer> cur,Set<Integer> set){
        System.out.println(cur);
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i)){
                System.out.println(i);
                cur.add(nums[i]);
                set.add(i);
                dfs(nums,cur,set);
                set.remove(i);
                cur.remove(cur.size()-1);
            }
        }
    }
}
