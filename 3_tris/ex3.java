import java.util.Arrays;

class Ex3 {

	public static void kSort(int[] tab, int k) {
		for (int i = 0; i < Math.ceil(tab.length/(double)k); i++) {
			Arrays.sort(tab, i*k, Math.min(tab.length, (i+2)*k));
		}
	}

	public static void main(String[] args) {		
		int[] tab = {5, 3, 8, 4, 6, 5, 10, 2, 9, 1};
		kSort(tab, tab.length);
	}
}
