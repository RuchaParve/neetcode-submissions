class Solution {
    private int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
    private int ROWS,COLS;
    public int orangesRotting(int[][] grid) {
        ROWS =  grid.length;
        COLS = grid[0].length;
        int step=0;
        int fresh = 0 ;
        Queue<int[]> que = new LinkedList<>();


        for(int i = 0;i<ROWS;i++){
            for(int j = 0;j<COLS;j++){
                if(grid[i][j]==1){
                    fresh++;
                }
                if(grid[i][j]==2){
                    que.offer(new int[]{i,j});
                }
            }
        }

        while(!que.isEmpty()){
            int size = que.size();
            boolean rotted = false;
            for(int i=0;i<size;i++){
                int[] cur = que.poll();
                int r = cur[0];
                int c = cur[1];
                for( int[] dir: directions){
                    int nr = r + dir[0];
                    int nc = c + dir[1];
                    if(nr>=0 && nc>=0 && nr<ROWS && nc<COLS && grid[nr][nc]==1){
                        que.offer(new int[]{nr,nc});
                        grid[nr][nc] = 2;
                        fresh--;
                        rotted = true;
                    }
                }
            }
            System.out.println("fsif");
            if(rotted)step++;

        }
        return fresh==0?step:-1;
    }
}
