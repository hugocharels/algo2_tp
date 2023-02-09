class Bitonic {
	
	private int[] a = new int[]{5, 10, 13, 12, 8};

	private boolean isMaxIdx(int x) {
		return a[maxIdx-1] <= a[maxIdx] <= a[maxIdx+1];
	}

	private int findMaxIdx() {
		int maxIdx = a.length();
		while ( not isMaxIdx(maxIdx) ) {
			if (a[maxIdx-1] <= a[maxIdx] ) { maxIdx++; }
			else { maxIdx--; }
		}
		return maxIdx;
	}

	private boolean _contains(int lo, int hi) {
		if (lo == hi) { return false; }
		if (  )
	}

	public boolean contains(int findVal) {	
		
		int maxIdx =
		
	
		return true;
	}
}

