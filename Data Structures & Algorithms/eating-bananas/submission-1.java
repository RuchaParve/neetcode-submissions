class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=Arrays.stream(piles).max().getAsInt();
        int res=r;

        while (l<r){
            int mid = (l+r)/2;
            int sum = 0;
            for(int j=0;j<piles.length;j++){
               sum += Math.ceil((double) piles[j] / mid);
            }
            if(sum <= h){
                res=mid;
                r = mid;
            }
            else if(sum > h){
                l = mid + 1;
            }
        }
        return r;
}
}
