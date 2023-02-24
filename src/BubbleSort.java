class sample {
    final int[] arr;
    public sample(int[] i) {
        arr = i;
    }

    public int[] Sort(){
        bubbleSort b = new bubbleSort();
        b.Sort(arr);
        return arr;
    }

    public int[] Sort(int t){
        bubbleSort b = new bubbleSort();
        b.Sort(arr);
        return new int[]{1};
    }

    private static class bubbleSort {

        void Sort(int[] arr){
            int n = arr.length;
            for (int i = 0; i <n-1 ; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    int temp = arr[j];
                    if (arr[j]>arr[j+1]){
                        arr[j]= arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
    }


}