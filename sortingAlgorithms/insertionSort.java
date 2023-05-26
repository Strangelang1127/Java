public class insertionSort {
	public static void insertionSorting(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int currentIndex = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > currentIndex) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = currentIndex;
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	public static void insertionSorting(double[] arr) {
		for(int i = 1; i < arr.length; i++) {
			double currentIndex = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > currentIndex) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = currentIndex;
		}
		for(double i : arr) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		int[] numbers = {3, 11, 56, 78, 32, 12, 13};
		double[] numbers1 = {3.2, 11.1, 56.27, 78, 32, 12, 13, 11.01};
		insertionSorting(numbers);
		System.out.println();
		insertionSorting(numbers1);
	}
}
