public class selectionSort {
	public static void main(String[] args) {
		int[] numbers = {3, 12, 34, 27, 11, 9};
		selectionSort(numbers);
 	}
	
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		for(int i : arr) {
			 System.out.print(i+" ");
		 }
	}
	
	public static void selectionSort(double[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			double temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		for(double i : arr) {
			 System.out.print(i+" ");
		 }
	}
}
