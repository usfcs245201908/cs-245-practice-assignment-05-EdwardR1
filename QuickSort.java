public class QuickSort implements SortingAlgorithm {
    private void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = partition(arr, left, right);
            sort(arr, left, mid - 1);
            sort(arr, mid + 1, right);
        }

    }

    public int partition(int[] arr, int left, int right) {
        // int i = left + 1;
        // int j = right;
        // int pivot = left;
        // while (i <= j) {
        //     while (arr[i] <= arr[pivot] && i <= j) {
        //         i++;
        //     }
        //     while (arr[j] >= arr[pivot] && i <= j) {
        //         j--;
        //     }
        //     if (i < j) {
        //         swap(arr, i, j);
        //     }
        // }
        // swap(arr, j, pivot);
        // return j;
        int pivot = right;
        int i = (left - 1);
        for(int j=left; j<right; j++){
            if(arr[j] < arr[pivot]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }

}