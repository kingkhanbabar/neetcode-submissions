class Solution {
    public void dfs(int row,int col,int [][]image,boolean [][]visited,int color,int oldColor){
        int n = image.length;
        int m = image[0].length;
        visited[row][col] = true;
        image[row][col] =color;
        int dr[]= {-1,1,0,0};
        int dc[] = {0,0,-1,1};
        for(int i=0;i<4;i++){
            int nr = row+dr[i];
            int nc = col+dc[i];

            if(nr>=0 && nr<n && nc>=0 && nc<m && image[nr][nc]==oldColor
            && !visited[nr][nc]){
                dfs(nr,nc,image,visited,color,oldColor);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int oldColor = image[sr][sc];
        boolean [][]visited = new boolean[n][m];
        if(oldColor == color) return image;
        dfs(sr,sc,image,visited,color,oldColor);
        return image;
    }
}