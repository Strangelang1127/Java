public class quickSort {
    public static void quickSorting(int[] array) {
        quickSorting(array, 0, array.length - 1);
        for(int i : array) {
            System.out.print(i+" ");
        }
    }
    
    private static void quickSorting(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSorting(array, left, pivotIndex - 1);
            quickSorting(array, pivotIndex + 1, right);
        }
    }
    
    private static int partition(int[] array, int left, int right) {
        int pivotIndex = left;
        int storeIndex = pivotIndex + 1;
        if (Math.random() < 0.5) {
            swap(array, pivotIndex, right);
        }
        for (int i = pivotIndex + 1; i <= right; i++) {
            if (array[i] < array[pivotIndex] || (array[i] == array[pivotIndex] && Math.random() < 0.5)) {
                swap(array, i, storeIndex);
                storeIndex++;
            }
        }
        swap(array, pivotIndex, storeIndex - 1);
        return storeIndex - 1;
    }
    
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] arrayOfNumbers = {11, 27, 23, 43, 1, 4, 90, 3};
        quickSorting(arrayOfNumbers);
    }
}
