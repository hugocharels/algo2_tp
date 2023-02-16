class Ex1 {

    private static int find(int p) {
        if (parent[p] != p) parent[p] = find(parent[p]);
        return parent[p];
    }

	public static void main(String[] args) {		
		
	}
}
