package default;


import java.util.ArrayDeque;


// Driver class to test above
class BFS
{      
	 private int ROW;
	 private int COL;
	 private ArrayDeque<Integer[]> queue;
			 	 
	 private Integer[] rc;
	 
	 public BFS(int r, int c){
		 this.ROW = r;
		 this.COL = c;
		 this.queue =  new ArrayDeque<Integer[]>();
		 
		 this.rc = new Integer[2];
	 }
	
	 private boolean isSafe( int row, int col, boolean[][] visited) {
	
		 return (row >= 0) && ( row < ROW) && (col >= 0) && (col < COL) && !visited[row][col];
	 }
	 
	 private void bfs(int[][] matrix, int row, int col, boolean[][] visited) {
		 
      queue.add( new Integer[] {row, col} );	
      
	  while(!queue.isEmpty()) {
		 
		 rc = queue.pop();
		 System.out.println(matrix[rc[0]][rc[1]]);
		 visited[rc[0]][rc[1]] = true; 
			
			 if (isSafe(rc[0] + 1, rc[1] + 0, visited)) {
				 queue.add( new Integer[] {rc[0] + 1,  rc[1] + 0} );
				 visited[rc[0] + 1][rc[1] + 0] = true;
			   } 
			 if (isSafe(rc[0] + 0, rc[1] + 1, visited)) {
				 queue.add( new Integer[] {rc[0] + 0,  rc[1] + 1} );	
				 visited[rc[0] + 0][rc[1] + 1] = true;
			 }
	  }
		 
	 }
	
	 private void traverse(int[][] matrix) {
		 
		 boolean[][] visited = new boolean[ROW][COL];
		 
		 bfs(matrix, 0, 0, visited);
				 
					 
	 }
	  public static void main(String a[]) {
		  
		  int[][] matrix = {{ 2, 4, 9 },
				            { 3, 1, 0 },
				            { 5, 8, 7 } };
	  
		  BFS bfs = new BFS(matrix.length, matrix[0].length);
		  
		  bfs.traverse(matrix);
		  
      }// main method

} // main class
