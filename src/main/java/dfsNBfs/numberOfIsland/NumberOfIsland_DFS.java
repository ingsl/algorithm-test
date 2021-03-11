package dfsNBfs.numberOfIsland;

public class NumberOfIsland_DFS {
    // 1은 육지, 2는 바다
    // 섬의 갯수 구하기

    public static void main(String[] args) {
        char [][] grid = {
            {'1','1','1','0','1' },
            {'1','1','0','0','0' },
            {'1','1','0','0','1' },
            {'0','0','0','0','1' }
        };
        NumberOfIsland_DFS noiDfs = new NumberOfIsland_DFS();

        System.out.println(noiDfs.solve(grid));
    }

    public int solve(char[][] grid) {
        print(grid);

        int count = 0;
        if(grid == null || grid.length == 0 || grid[0].length ==0) return count;

        for(int i =0; i<grid.length; i ++) {
            for (int j = 0; j < grid[i].length; j++) {

                if(grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j) ;
                }
            }
            System.out.println("");
        }

        System.out.println("========================");
        print(grid);
        return count;
    }

    public void dfs(char[][] grid, int i, int j) {
        int m =grid.length;
        int n =grid[0].length;

        if(i<0 || i>= m || j<0 || j>=n || grid[i][j] != '1') return;

        //grid값을 X로 변경해주니까  solve for문에서 걸림
        grid[i][j]= 'X';

        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
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
