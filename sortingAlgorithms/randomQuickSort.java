import java.util.Random;
public class randomQuickSort {

    public static void randomQuickSorting(int[] array) {
        randomQuickSorting(array, 0, array.length - 1);
        for(int i : array) {
            System.out.print(i+" ");
        }
    }

    private static void randomQuickSorting(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = randomPartition(array, left, right);
            randomQuickSorting(array, left, pivotIndex - 1);
            randomQuickSorting(array, pivotIndex + 1, right);
        }
    }

    private static int randomPartition(int[] array, int left, int right) {
        int randomIndex = new Random().nextInt(right - left + 1) + left;
        swap(array, randomIndex, left); // Swap pivot with first element
        int pivotIndex = left;
        int storeIndex = pivotIndex + 1;
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
        randomQuickSorting(arrayOfNumbers);
    }
}
