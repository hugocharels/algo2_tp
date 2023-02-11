import java.util.Random;

class Ex3 {
	
	private static int F = new Random().nextInt(1000);

	private static boolean eggBroke(int stage) {
		if (stage > F) return true;
		return false;
	} 
	private static int[] findBounds() {
		int[] bounds = new int[]{0, 1} ;
		while(!eggBroke(bounds[1])) {
			bounds[0] = bounds[1];
			bounds[1] *= 2;
		}
		return bounds;
	}

	private static int findStage() {
		int[] bounds = findBounds();
		while(bounds[0] <= bounds[1]) {
			int mid = (bounds[0] + bounds[1]) / 2;
			if (eggBroke(mid)) { bounds[1] = mid-1; }
			else { bounds[0] = mid+1; }
		}
		return bounds[1];
	}

	public static void main(String[] args) {
		System.out.print("The stage = ");
		System.out.println(F);
		System.out.print("The stage found = ");
		System.out.println(findStage());
	}
}
