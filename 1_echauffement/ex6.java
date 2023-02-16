class Ex6 {
	
	private static boolean contains(int[][] matrix, int findVal) {
        	int row = 0;
        	int col = matrix[0].length - 1;
		while (row < matrix.length && col >= 0) {
            		if (matrix[row][col] == findVal) {
                		return true;
            		} else if (matrix[row][col] < findVal) {
                		row++;
            		} else {
                		col--;
            		}
        	}
        	return false;	
	}


	public static void main(String[] args) {
		
		int[][] matrix = new int[][]{
			{ 1,  2,  8, 12, 16},
			{ 3,  4, 10, 15, 19},
			{ 7,  9, 20, 24, 26},
			{10, 14, 22, 28, 33},
			{13, 18, 25, 32, 40}
		};
		
		System.out.println(contains(matrix, 7));
		System.out.println(contains(matrix, 23));
	}
}
