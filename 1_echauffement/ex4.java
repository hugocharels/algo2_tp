import java.util.Arrays;

class Ex4 {
	
	public static void main(String[] args) {
		int[] array = new int[]{5, 10, 5, 5, 20, 12, 8, 5, 5};
		Arrays.sort(array);
		System.out.println(array[array.length / 2]);
	}
}
