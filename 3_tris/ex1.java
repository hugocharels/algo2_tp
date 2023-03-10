class Ex1 {

	public static void swap(int[] tab, int i, int j) {
		int tmp = tab[i]; tab[i] = tab[j]; tab[j] = tmp;
	}

	public static void partition(int[] tab) {
		int low=0, high=tab.length, i=1;
		int v = tab[0];
		while (i < high) {
			if (tab[i] < v) {
				swap(tab, i++, low++);
			} else if (tab[i] > v) {
				swap(tab, i, --high);
			} else {
				i++;
			}
		}
	}

	public static void main(String[] args) {		
		int[] tab = {5, 3, 8, 4, 6, 5, 10, 2, 9, 1};
		partition(tab);
	}
}
