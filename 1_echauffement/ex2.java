class Ex2 {

	private static int findMaxIdx(int[] array) {
		int high = array.length-1;
		int low = 0;
		int maxIdx = 0;
		while ( high != low ) {
			maxIdx = low  + ((high - low) / 2);	
			if ( array[maxIdx-1] < array[maxIdx] && array[maxIdx] < array[maxIdx+1] ) {
				low = maxIdx + 1;
			}
			else if ( array[maxIdx-1] > array[maxIdx] && array[maxIdx] > array[maxIdx+1] ) {
				high = maxIdx - 1;
			}
			else { break; }
		}
		return maxIdx;
	}

	private static boolean _contains(int[] array, int findVal, int low, int high) {
		if (array[high] == findVal) { return true; }
		while (low <= high) {
			int mid = low  + ((high - low) / 2);
			if (array[mid] < findVal) {
				low = mid + 1;
			} else if (array[mid] > findVal) {
				high = mid - 1;
			} else if (array[mid] == findVal) {
				return true;
			}
		}
		return false;
	}

	private static boolean contains(int[] array, int findVal) {	
		int maxIdx = findMaxIdx(array);
		return _contains(array, findVal, 0, maxIdx) || _contains(array, findVal, maxIdx, array.length-1);
	}

	public static void main(String[] args) {
		int[] a = new int[]{5, 10, 13, 20, 12, 8};
		System.out.println(contains(a, 5));
		System.out.println(contains(a, 10));
		System.out.println(contains(a, 13));
		System.out.println(contains(a, 20));
		System.out.println(contains(a, 12));
		System.out.println(contains(a, 8));
		System.out.println(contains(a, 9));
	}
}
