class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0;
        int l=0;
        int r=heights.length-1;

        while(l<r){
          int min = Math.min(heights[l],heights[r]);
          maxArea = Math.max(min * (r-l),maxArea);  
          if(heights[l]<heights[r]){
            l++;
          }
          else{
            r--;
          }
        } 

        return maxArea;

    }
}
