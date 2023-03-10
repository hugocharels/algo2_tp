class Ex4 {

	public static int[] mergeSorted(int a[], int b[], int c[]) {
		int[] tab = new int[a.length + b.length + c.length];
		int i = 0, j = 0, k = 0;
		for (int l = 0; l < tab.length; l++) {
			if (i < a.length && a[i] < b[j] && a[i] < c[k]) {
				tab[l] = a[i++];
			} else if (j < b.length && b[j] < a[i] && b[j] < c[k]) {
				tab[l] = b[j++];
			} else if (k < c.length) {
				tab[l] = c[k++];
			}
		}
		return tab;
	}

	public static void main(String[] args) {
		int a[] = {1, 3, 5, 7, 9};
		int b[] = {2, 4, 6, 8, 10};
		int c[] = {4, 5, 7, 9, 15};
		mergeSorted(a, b, c);
	}
}
