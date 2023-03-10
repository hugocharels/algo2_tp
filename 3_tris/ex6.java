class Ex6 {

	public static int search(int[] tab, int x, int low, int high) {
		// recherhe l'index ou inséré l'élément x dans tab [O(log n)]
		while (low < high) {
			int mid = (low + high) / 2;
			if (tab[mid] < x) {
				low = mid + 1;
			} else {
				high = mid;
			}
		} return low;
	}

	public static int[] mergeSorted(int a[], int b[]) {
		if(a.length < b.length) return mergeSorted(b, a);
		int[] tab = new int[a.length + b.length];
		int low = 0, high = a.length, l = 0;
		for (int i = 0; i < b.length; i++) {
			int idx = search(a, b[i], low, high);
			while (low < idx) { tab[l++] = a[low++]; }
			tab[l++] = b[i];
		}
		while (low < high) { tab[l++] = a[low++]; }
		return tab;
	}

	public static void main(String[] args) {
		int a[] = {1, 3, 5, 7, 9};
		int b[] = {2, 4, 6, 8, 10};
		mergeSorted(a, b);
	}

}
