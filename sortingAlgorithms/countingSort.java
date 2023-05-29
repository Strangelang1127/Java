import java.util.Arrays;

public class countingSort {

    public static void countingSorting(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int max = Arrays.stream(array).max().getAsInt();
        int[] count = new int[max + 1];
        for (int num : array) {
            count[num]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[index] = i;
                index++;
                count[i]--;
            }
        }
        for(int i : array) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arrayOfNumbers = {11, 27, 23, 43, 1, 4, 90, 3};
        countingSorting(arrayOfNumbers);
    }
}
