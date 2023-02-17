class Ex2 {

	private static void print(int[] id) {
		System.out.print("[");
		for (int i=0; i<id.length; i++) {
			System.out.print(id[i] + (i == id.length-1 ? "]\n" : ", "));
		}
	}

	private static void badUnion(int[] id, int p, int q) {
		if (id[p] == id[q]) return;
		for (int i = 0; i < id.length; i++) {
			if (id[i] == id[p]) id[i] = id[q];
		}
	}

	private static void goodUnion(int[] id, int p, int q) {
		int pID = id[p];
		int qID = id[q];
		if (pID == qID) return;
		for (int i = 0; i < id.length; i++) {
			if (id[i] == pID) id[i] = qID;
		}
	}

	public static void main(String[] args) {		
		int[] id1 = new int[]{1, 2, 2, 1, 2, 1};
		int[] id2 = new int[]{1, 2, 2, 1, 2, 1};
		badUnion(id1, 2, 0);
		goodUnion(id2, 2, 0);
		print(id1);
		print(id2);
	}
}
