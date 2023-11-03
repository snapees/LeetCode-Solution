
// Arrays Example


import java.util.Arrays;

class Pair{
    public int min;
    public int max;
}

public class Maxmin {


    static Pair getMinMax(int[] arr, int n){
        Pair minmax = new Pair();
        Arrays.sort(arr);
        minmax.min = arr[0];
        minmax.max = arr[n-1];
        return minmax;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        Pair minmax = getMinMax(arr, arr.length);
        System.out.println(minmax.min);
        System.out.println(minmax.max);
    }
}
