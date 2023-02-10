class Ex5 {
	
	private static int findMostOccurrence(int[] array) {
		int best = array[0];
		int p = 1;

		for (int i=1; i<array.length; i++) {
			if ( array[i] == best ) { p++; }
			else {
				p--;
				if ( p == 0) { best = array[i+1]; }
			}
		}
		return best;
	}

	public static void main(String[] args) {
		int[] array = new int[]{5, 10, 5, 5, 20, 12, 8, 5, 5};
		System.out.println(findMostOccurrence(array));
	}
}
