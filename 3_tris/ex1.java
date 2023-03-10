class Ex1 {

	public static void swap(int[] tab, int i, int j) {
		int tmp = tab[i];
		tab[i] = tab[j];
		tab[j] = tmp;
	}

	public static void partition(int[] tab) {
		int l=0, h=tab.length, i=1;
		int v = tab[0];
		while (i<h) {
			if (tab[i] < v) {
				swap(tab, i++, l++);
			} else if (tab[i] > v) {
				swap(tab, i, --h);
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
