public class mergeSort {
    public static void mergeSorting(int[] array){
        int[] temporaryArray = new int[array.length];
        mergeSorting(array, temporaryArray, 0, array.length - 1);
        for(int i : array) {
            System.out.print(i+" ");
        }
    }

    public static void mergeSorting(int[] array, int[] temporaryArray, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSorting(array, temporaryArray, left, mid);
            mergeSorting(array, temporaryArray, mid + 1, right);
            merge(array, temporaryArray, left, mid , right);
        }    
    }

    public static void merge(int[] array, int[] temporaryArray, int left, int mid, int right) {
        for(int i = left; i <= right; i++){
            temporaryArray[i] = array[i];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        int inversions = 0;
        while (i <=  mid && j <= right) {
            if (temporaryArray[i] <= temporaryArray[j]) {
                array[k] = temporaryArray[i];
                i++;
            }else{
                array[k] = temporaryArray[j];
                j++;
                inversions += (mid - i + 1);
            }
            k++;
        }
        while(i <= mid){
            array[k] = temporaryArray[i];
            i++;
            k++;
        }
        while (j <=  right) {
            array[k] = temporaryArray[j];
            j++;
            k++;
        }
    }
  
    public static void main(String[] args) {
        int[] arrayOfNumbers = {23, 43, 1, 4, 90, 3, 27, 11, 21};
        mergeSorting(arrayOfNumbers);
    }
}
