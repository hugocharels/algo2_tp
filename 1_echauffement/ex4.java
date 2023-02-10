import java.util.Arrays;

class Ex4 {

	private static int findMostOccurrence(int[] array) {
		Arrays.sort(array);
		return array[array.length / 2];
	}

	public static void main(String[] args) {
		int[] array = new int[]{5, 10, 5, 5, 20, 12, 8, 5, 5};
		System.out.println(findMostOccurrence(array));
	}
}
