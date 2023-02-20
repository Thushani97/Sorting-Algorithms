public class SelectionSort {
    static void selectionSort(int[] sortArray){
        for (int i = 0; i < sortArray.length; i++) {
            int temp=0;
            int index=i;
            for (int j = i; j < sortArray.length-1; j++) {

                if (sortArray[index]>sortArray[j+1]){
                    index=j+1;
                }

            }
            temp=sortArray[i];
            sortArray[i]=sortArray[index];
            sortArray[index]=temp;

        }
        System.out.println(sortArray);
    }
}
