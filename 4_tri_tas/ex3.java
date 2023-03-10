class Ex3 {

	public static boolean isHeap(int[] heap) {
		for (int i = 1; i < heap.length; i++) {
			int parent = heap[i];
			int leftIdx = 2*i+1;
			int rightIdx = 2*i+2;
			if (leftIdx < heap.length && parent < heap[leftIdx]) {
				return false;
			} if (rightIdx < heap.length && parent < heap[rightIdx]) {
				return false;
			}
		} return true;
	}

	public static void main(String[] args) {
		int[] heap = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.print("is a heap ? ");	
		System.out.println(isHeap(heap));
	}
}