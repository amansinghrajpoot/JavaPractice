// Ignores diagonals

package parse_json;

// Driver class to test above
class LongestIsland
{      
	   int ROW ;
	   int COL ;
	   
	   
	   public LongestIsland(int r, int c){
	   ROW = r;
	   COL = c;
	   }
	   private int sum = 0;
	   private int largest_island = 0;
	   
	   private static int rowad[] = new int[] { -1, 0, 0, 1 };
	   private static int colad[] = new int[] { 0, -1, 1, 0 };
	   
	  
       boolean isSafe(int matrix[][], int row, int col, boolean[][] visited) {
		
    	   return (row >= 0) && (col >= 0) && (row < ROW) && (col < COL) && (matrix[row][col] == 1 && !visited[row][col]);
       }
       
	   private void dfs(int matrix[][],int row, int col, boolean visited[][] ) {
		   
		   visited[row][col] = true;
		   
		   for(int i = 0; i < 4; i ++) {
			   if ( isSafe(matrix, row + rowad[i] , col + colad[i],  visited))
			   {  
				   dfs(matrix, row + rowad[i] , col + colad[i],  visited);
			   } //if
		   }
		   this.sum++;
		   
	   }
       private int countIslands(int matrix[][] ) {
		   int count = 0;
    	   boolean visited[][] = new boolean[ROW][COL];
    	       	   
    	   for (int i = 0; i < ROW; i++) {
    		   for (int j = 0; j < COL; j++) {
    			   
    			   if ( matrix[i][j] == 1 && !visited[i][j] )
    			   {
    			   visited[i][j] = true;
    			   dfs(matrix, i, j, visited);
    			   count ++;
    			   }
    			   if (this.sum > this.largest_island) this.largest_island = this.sum;
    			   this.sum = 0;
    		   }
    	   }
    	   
    	   return count;
    	   
       }
	    // Driver method
	    public static void main(String[] args) throws java.lang.Exception
	    {
	        int matrix[][] = new int[][] {{ 1, 1, 0, 0, 1 },
	                                  	   { 0, 0, 0, 0, 0 },
	                                       { 1, 1, 1, 1, 1 },
	                                       { 0, 1, 0, 0, 0 },
	                                       { 1, 0, 0, 0, 1 } };
	        
	        LongestIsland I = new LongestIsland(matrix.length, matrix[0].length);
	       
	        System.out.println("Number of islands is: " + I.countIslands(matrix));
	        System.out.println("Largest Island: "+ I.largest_island );
	    }
	

} // main class
