import java.util.Arrays;

public class ChocDist {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 2, 4, 9, 12, 56 };

        int m = 3; // Number of students

        int n = arr.length;
        System.out.println("Minimum difference is "
                + findMinDiff(arr, n, m));
    }

    private static int findMinDiff(int[] arr, int n, int m) {
        if (m == 0 || n ==0) return 0;
        if (n < m) return -1;
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i+m-1] - arr[i];
            if (diff < min_diff) min_diff = diff;
        }
        return min_diff;
    }


}
