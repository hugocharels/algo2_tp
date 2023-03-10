class Ex2 {

	public static void swap(int[] tab, int i, int j) {
		int tmp = tab[i]; tab[i] = tab[j]; tab[j] = tmp;
	}

	public static int partition(int[] tab, int low, int high, int pivot) {
		int i=low, j=low;
		while (i < high) {
			if (tab[i] < pivot) { swap(tab, i++, j++); }
			else if (tab[i] == pivot) { swap(tab, i, high); }
			else { i++; }
		}
		swap(tab, j, high);
		return j;
	}

	public static void associate(int[] tab1, int[] tab2, int low, int high) {
		if (low > high) return;
		int tab1Pivot = (low + high) / 2;
		int idxPivot = partition(tab2, low, high, tab1[tab1Pivot]);
		partition(tab1, low, high, tab2[idxPivot]);
		associate(tab1, tab2, low, idxPivot - 1);
		associate(tab1, tab2, idxPivot + 1, high);
	}

	public static void main(String[] args) {		
		System.out.println("flemme");
	}
}
