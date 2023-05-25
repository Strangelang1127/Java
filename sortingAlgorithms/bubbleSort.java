package Sorting;

public class bubbleSort {
	public static void swap(int[] array, int i, int  j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void swap(double[] array, int i, int j) {
		double temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void bubbleSort(int[] arr) {
		boolean swapped;
		int swappedCounter = 0;
		do {
			 swapped = false;
			 for(int i = 0; i < arr.length - 1; i++) {
				 if(arr[i] > arr[i+1]) {
					 swap(arr, i,i + 1);
					 swapped = true;
					 swappedCounter++;
				 }
			 }
		 }while(swapped);
		
		for(int i : arr) {
			 System.out.print(i+" ");
		 }
	}
	
	public static void bubbleSort(double[] arr) {
		boolean swapped;
		int swappedCounter = 0;
		do {
			 swapped = false;
			 for(int i = 0; i < arr.length - 1; i++) {
				 if(arr[i] > arr[i+1]) {
					 swap(arr, i,i + 1);
					 swapped = true;
					 swappedCounter++;
				 }
			 }
		 }while(swapped);
		
		for(double i : arr) {
			 System.out.print(i+" ");
		 }
	}
	public static void main(String[] args) {
		int[] numbers = {23, 43, 1, 4, 90, 3, 27, 11, 21};
		bubbleSort(numbers);
	}
}
