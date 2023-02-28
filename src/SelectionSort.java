import java.util.Arrays;

public class SelectionSort {
    static String selectionSort(int[] arr){
        int n= arr.length;
        for (int i = 0; i <n ; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

        }
        return (Arrays.toString(arr));
    }
}
//23, 4,12,9,3,-12,-3