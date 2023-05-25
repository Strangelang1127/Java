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
	public static void main(String[] args) {
		int[] numbers = {23, 43, 1, 4, 90, 3, 27, 11};
		boolean swapped;
		int swappedCounter = 0;
		 do {
			 swapped = false;
			 for(int i = 0; i < numbers.length - 1; i++) {
				 if(numbers[i] > numbers[i+1]) {
					 swap(numbers, i,i + 1);
					 swapped = true;
					 swappedCounter++;
				 }
			 }
		 }while(swapped);
		 
		 for(int i : numbers) {
			 System.out.print(i+" ");
		 }
	}
}
