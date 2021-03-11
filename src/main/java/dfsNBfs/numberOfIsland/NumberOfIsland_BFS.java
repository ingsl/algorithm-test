package dfsNBfs.numberOfIsland;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland_BFS {
    public static void main(String[] args) {
        char [][] grid = {
                {'1','1','1','0','1' },
                {'1','1','0','0','1' },
                {'0','0','0','0','0' },
                {'0','0','0','1','1' }
        };

        NumberOfIsland_BFS noiBfs = new NumberOfIsland_BFS();

        System.out.println(noiBfs.solve(grid));
    }

    public int solve(char[][] grid) {
        int result =0;
        if (grid == null || grid[0].length == 0) return result;

        for(int i =0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    result++;
                    bfs(grid, i, j);
                }
            }
        }
        System.out.println("===========");
        print(grid);
        return result;
    }


    public void bfs(char[][] grid, int x, int y) {
        int[][] dirs = { {-1,0}, {1,0}, {0,1},{0,-1} };
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});

        while(!queue.isEmpty()) {
            int size = queue.size();
            int[] point = queue.poll();
                for(int[] dir : dirs) {
                    int x1 = point[0]+dir[0];
                    int y1 = point[1]+dir[1];
                    if(x1>=0 && y1>=0 && x1 < grid.length && y1 < grid[0].length && grid[x1][y1] == '1') {
                        grid[x1][y1]='X';
                        queue.offer(new int[] {x1,y1});
                }
            }
        }

    }

    public void print(char[][] grid) {
        for(int i =0; i<grid.length; i ++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print("  grid["+i+"]["+j+"] : " +grid[i][j]);
            }
            System.out.println("");
        }
    }
}
