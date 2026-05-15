class Solution {

    HashMap<Integer,Integer> memo =  new HashMap<>();
    public int dfs(int amount,int[] coins){
        if(amount == 0) return 0;

        if(memo.containsKey(amount)){
          return memo.get(amount);
        }
        int res = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if (amount - coins[i] >= 0) {
                int result = dfs(amount - coins[i], coins);
                if (result != Integer.MAX_VALUE) {
                    res = Math.min(res, 1 + result);
                }
            }
        }

        memo.put(amount,res);
        return res;
    }

    public int coinChange(int[] coins, int amount) {
       int minCoins = dfs(amount,coins);

       return minCoins == Integer.MAX_VALUE ? -1 : minCoins;

    }
}
