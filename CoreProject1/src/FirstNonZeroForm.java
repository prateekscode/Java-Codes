public class FirstNonZeroForm {

	public static void main(String[] args) {
		int a[] = { 1, 2, 0, 3, 0, 0, 5, 4, 0 };
		// first non Zero element after that zero element in same order
		// output: 1,2,3,5,4,0,0,0,0

		int a1[] = new int[a.length];
		int j = 0;
		int k = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				a1[j] = a[i];
				j++;
			} else {
				a1[k] = a[i];
				k--;
			}

		}

		for (int m : a1) {
			System.out.println(m);
		}

	}

}