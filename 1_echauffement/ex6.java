class Ex6 {
	
	private static boolean contains(int[][] matrix, int findVal) {

		int highX = matrix.length-1;
		int highy = matrix.length-1;

		int lowX = 0;
		int lowy = 0;

		int midX = highX / 2;
		int midY = highY / 2;


		// des choses

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
