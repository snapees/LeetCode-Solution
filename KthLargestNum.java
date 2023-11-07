// using Array
// with Sorting
//without sorting

import java.util.Arrays;

public class KthLargestNum {
    public static void main(String[] args)
    {
        int[] arr = { 3,2,3,1,2,4,5,5,6 };
        int k = 4;

        System.out.println("Kth Largest Number: " + findKthLargest(arr, k));
    }

    public static int findKthLargest(int[] arr, int k) {
        // with Sorting
        Arrays.sort(arr);
        return arr[arr.length-k];


//        without sorting
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int temp = 0;
//                if (arr[i] > arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//            System.out.println(Arrays.toString(arr));
//        }
//        return arr[n-k];
    }
}
