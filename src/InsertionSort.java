public class InsertionSort {
    static void insertionSort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
//            in arr[i];
            int k = i-1;
            for (int j = 0; j < i; j++) {
                if(arr[k] >= arr[i]){
                    k=k+1;
                    System.out.println(String.valueOf(arr[k]));
                }else{
                    break;
                }
            }
            arr[i]=arr[k];
//            System.out.println(String.valueOf(arr[i]));
            }
        }
    }

//}
//// arr=[2,5,8,34,3,6]