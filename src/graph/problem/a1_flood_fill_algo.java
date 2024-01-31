package graph.problem;

public class a1_flood_fill_algo {
    public static void main(String[] args) {

    }







    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialcolor = image[sr][sc];
        int[][] ans = image ;
        int rowdel[] ={-1,0,1,0};
        int coldel[] = {0,1,0,-1};
        dfs(image,  sr,  sc,  color,initialcolor, ans , rowdel,coldel);
return ans ;

}

    private void dfs(int image[][], int row, int col, int color, int initialcolor, int[][] ans, int rowdel [], int coldel []) {
        ans[row][col] = color;
        int n = image.length;
        int m = image[0].length;
        for (int i = 0; i < 4; i++) {

            int nrow = row + rowdel[i];
            int ncol = col + coldel[i];
            // then check for same initial color and unvisited pixel
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                    image[nrow][ncol] == initialcolor && ans[nrow][ncol] != color) {
                dfs(image, nrow, ncol, color, initialcolor, ans, rowdel, coldel);
            }

        }
    }
    }
