class A {
	
	private int[] a = new int[]{5, 10, 8};

	private boolean isMinLoc(int i) {
		return a[i-1] >= a[i] && a[i+1] >= a[i]; 
	}

	public static void main() {
		
			

	}
}

