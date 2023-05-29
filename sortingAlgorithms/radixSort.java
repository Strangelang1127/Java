import java.util.Arrays;

public class radixSort {

    public static void radixSorting(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int max = Arrays.stream(array).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(array, exp);
        }
        for(int i : array) {
            System.out.print(i+" ");
        }
    }

    private static void countingSortByDigit(int[] array, int exp) {
        int[] count = new int[10];
        int[] output = new int[array.length];
        for (int num : array) {
            int digit = (num / exp) % 10;
            count[digit]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (int i = array.length - 1; i >= 0; i--) {
            int num = array[i];
            int digit = (num / exp) % 10;
            output[count[digit] - 1] = num;
            count[digit]--;
        }
        System.arraycopy(output, 0, array, 0, array.length);
    }

    public static void main(String[] args) {
        int[] arrayOfNumbers = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSorting(arrayOfNumbers);
    }
}
