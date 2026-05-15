class Solution {
    private int INF = 2147483647;
    private int ROWS, COLS;
    private int[][] directions = {{1, 0}, {-1, 0},{0, 1}, {0, -1}};

    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> que = new LinkedList<>();
        ROWS = grid.length;
        COLS = grid[0].length;
        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                System.out.print("["+i+","+j+"]");
                if(grid[i][j]==0){
                    que.add(new int[]{i,j});
                }
            }
        }

        

        while(!que.isEmpty()){
            int[] cur = que.poll();
            int r = cur[0];
            int c = cur[1];

            for(int[] dir: directions){
                int nr =  r+dir[0];
                int nc = c+dir[1];
                if (nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == INF) {    
                    grid[nr][nc] = grid[r][c] + 1;
                    que.add(new int[]{nr, nc});
                }
            }

        }
    }
}
