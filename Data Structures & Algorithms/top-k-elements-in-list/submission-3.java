class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp= new HashMap<>(); 
        int[] ans = new int[k];
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for(int i=0;i<nums.length;i++){
           int val = mp.getOrDefault(nums[i],0);
           mp.put(nums[i],val+1);
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                ans[index++] = n;
                if (index == k) {
                    return ans;
                }
            }
        }
        return ans;

    }
}
