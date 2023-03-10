class Ex4 {

	public static void swap(int[] tab, int i, int j) {
		int tmp = tab[i]; tab[i] = tab[j]; tab[j] = tmp;
	}

	public static void swim(int[] heap, int idx) {
		// log n comparaisons atm
		while (idx > 0 && heap[idx] > heap[idx/2]) {
			swap(heap, idx, idx/2);
			idx = idx/2;
		}
	}

	public static void insert(int[] heap, int size, int value) {
		heap[size] = value;
		swim(heap, size++);
	}

	public static void main(String[] args) {
		int[] heap = new int[10];
		heap[0] = 11; heap[1] = 9; heap[2] = 8; heap[3] = 7; heap[4] = 6; heap[5] = 4;		
		insert(heap, 6, 10);
	}
}
