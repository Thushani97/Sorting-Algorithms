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

//        n=[12,3,34,-1,7]
//        for i in range(0,len(n)):
//          index=i
//          for j in range(i,len(n)-1):
//              if(n[index]>n[j+1]):
//                  index=j+1
//          n[i],n[index]= n[index],n[i]
//
//        print(n)
