class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a->a[0]));
        int[][] res = new int[k][2];

        for(int[] point: points){
            int distance = point[0]*point[0] + point[1]*point[1];
            pq.offer(new int[]{distance,point[0],point[1]});
        }

        int i=0;
        while(i<k){
            int [] point = pq.poll();
            res[i] = new int[]{point[1],point[2]};
            i++;
        }

        return res;
    }
}
