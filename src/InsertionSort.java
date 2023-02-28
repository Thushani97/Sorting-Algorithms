//public class InsertionSort {
//    static void insertionSort(int[] arr){
//            int n = arr.length;
//            for (int i = 1; i < n; ++i) {
//                int key = arr[i];
//                int j = i-1;
//                for (int k = 0; k < ; k++) {
//                    if (arr[j+1]<arr[])
//                }
//            }
//        }
//
//    }
//
//
//// arr=[23, 4,12,9,3,-12,-3]
//
//void sort(int arr[])
//        {
//        int n = arr.length;
//        for (int i = 1; i < n; ++i) {
//        int key = arr[i];
//        int j = i - 1;
//
//            /* Move elements of arr[0..i-1], that are
//               greater than key, to one position ahead
//               of their current position */
//        while (j >= 0 && arr[j] > key) {
//        arr[j + 1] = arr[j];
//        j = j - 1;
//        }
//        arr[j + 1] = key;
//        }
//        }