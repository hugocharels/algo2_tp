class BinarySearch {
	public boolean search(int[] sortedArray, int key) {

		int high = sortedArray.length - 1;
		int low = 0;

		while (low <= high) {
			int mid = low  + ((high - low) / 2);
			if (sortedArray[mid] < key) {
				low = mid + 1;
			} else if (sortedArray[mid] > key) {
				high = mid - 1;
			} else if (sortedArray[mid] == key) {
				return true;
			}
		}
		return false;
	}
}
