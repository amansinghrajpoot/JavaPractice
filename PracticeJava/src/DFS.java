package parse_json;


import java.util.Stack;


// Driver class to test above
class DFS
{      
	 private int ROW;
	 private int COL;
	 private Stack<Integer[]> stack;
			 	 
	 private Integer[] rc;
	 
	 public BFS(int r, int c){
		 this.ROW = r;
		 this.COL = c;
		 this.stack =  new Stack<Integer[]>();
		 
		 this.rc = new Integer[2];
	 }
	
	 private boolean isSafe( int row, int col, boolean[][] visited) {
	
		 return (row >= 0) && ( row < ROW) && (col >= 0) && (col < COL) && !visited[row][col];
	 }
	 
	 private void dfs(int[][] matrix, int row, int col, boolean[][] visited) {
		 
      stack.push( new Integer[] {row, col} );	
      
	  while(!stack.isEmpty()) {
		 
		 rc = stack.pop();
		 System.out.println(matrix[rc[0]][rc[1]]);
		 visited[rc[0]][rc[1]] = true; 
			
			 if (isSafe(rc[0] + 1, rc[1] + 0, visited)) {
				 stack.add( new Integer[] {rc[0] + 1,  rc[1] + 0} );
				 visited[rc[0] + 1][rc[1] + 0] = true;
			   } 
			 if (isSafe(rc[0] + 0, rc[1] + 1, visited)) {
				 stack.add( new Integer[] {rc[0] + 0,  rc[1] + 1} );	
				 visited[rc[0] + 0][rc[1] + 1] = true;
			 }
	  }
		 
	 }
	
	 private void traverse(int[][] matrix) {
		 
		 boolean[][] visited = new boolean[ROW][COL];
		 
		 dfs(matrix, 0, 0, visited);
				 
					 
	 }
	  public static void main(String a[]) {
		  
		  int[][] matrix = {{ 2, 4, 9 },
				            { 3, 1, 0 },
				            { 5, 8, 7 } };
	  
		  BFS dfs = new DFS(matrix.length, matrix[0].length);
		  
		  dfs.traverse(matrix);
		  
      }// main method

} // main class
