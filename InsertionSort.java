public class InsertionSort implements SortingAlgorithm {
    public void sort(int[] arr){
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }
}