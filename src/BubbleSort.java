import java.util.ArrayList;

public class BubbleSort {
    static void bubbleSort(int[] arr){
//        List<String> stringList = new ArrayList<>(list.size()); // added initial capacity inside the ().
//        for (int x:list) {
//            stringList.add(String.valueOf(x));
//        }
        int temp=0; // create a variable for swapping
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
//                System.out.println(i);
//                System.out.println(j);
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
}

// List , Array --> Fixed length. Static
//List<String> stringList = new ArrayList<>();
// ArrayList --> Variable length. Dynamic