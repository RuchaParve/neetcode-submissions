class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        Arrays.sort(piles);
        int r=piles[piles.length-1];
        int k = 1;
        while(l<=r){ 
            int mid= (l+r)/2;
            int sum = 0;
            for(int i: piles){ 
                int val = (i % mid != 0) ? (i/mid)+1 : i/mid;
                sum = sum+val;
            }

            if(sum<=h){
                r= mid-1; 
                k=mid;
            }
            else{
                l=mid+1;
            }
        }
        
        return k;
    }
}
