public class Main {
    public static void main(String[] args) {

//        int[] arr = new int[63]; // define the size inside []
        int[] arr = new int[]{3, 14, 45, 16, 73, -1};
        BubbleSort.bubbleSort(arr);
//        for(int i=0; i < arr.length; i++){
//            System.out.print(arr[i] + "  ");
//        }
        int[] selectSort = new int[]{3, 14, 45, 16, 73, -1};
        SelectionSort.selectionSort(selectSort);
        for (int i = 0; i < selectSort.length; i++) {
//            System.out.print(selectSort[i] + ' '); // this ' ' gives wrong answer since '' considered as an empty character
            System.out.print(selectSort[i] + " ");
//
        }
    }
}