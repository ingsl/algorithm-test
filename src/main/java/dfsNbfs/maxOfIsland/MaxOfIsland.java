package dfsNbfs.maxOfIsland;

public class MaxOfIsland {

    public static void main(String[] args) {
        int[][] grid = {
                {1,1,0,1,1},
                {0,1,1,0,0},
                {0,0,0,0,0},
                {1,1,0,1,1},
                {1,0,1,1,1},
                {1,0,1,1,1}
        };

        MaxOfIsland maxOfIsland = new MaxOfIsland();
        System.out.println( maxOfIsland.solve(grid) );


    }
    int m, n;
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    private int solve(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        m = grid.length;
        n = grid[0].length;
        int max =0;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == 1) {
                    int area = dfs(i, j, grid,0);
                    max = Math.max(max, area);

                }
            }
        }


        return max;
    }

    private int dfs(int x, int y, int[][] grid, int area) {

        if(x<0 || x>=m || y< 0 || y>=n || grid[x][y]!=1) return area;
        grid[x][y] = 2;
        area++;

        for(int[] dir : dirs) {
            area = dfs(x+dir[0], y+dir[1], grid, area);
        }

        return  area;
    }
}
