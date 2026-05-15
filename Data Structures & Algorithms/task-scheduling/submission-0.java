class Solution {
    public int leastInterval(char[] tasks, int n) {
        int count[] = new int[26];
        for(char task : tasks){
            count[task-'A']++;
        }


        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int cnt : count){
            if(cnt>0){
                pq.offer(cnt);
            }
        }

        int time =0;
        Queue<int[]> q = new LinkedList<>();
        while(!pq.isEmpty() || !q.isEmpty()){
            time++;
            if (pq.isEmpty()) {
                time = q.peek()[1];
            } 
            else
            { 
                int val = pq.poll()-1;
                if(val>0){
                    q.add(new int[]{val,time+n});
                }
            }

            if(!q.isEmpty() && q.peek()[1]==time){
                    pq.add(q.poll()[0]);
            }

        }
        return time;
    }
}
