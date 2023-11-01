import java.util.Scanner;

public class MaxProdSubArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[20];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int out = maxProduct(arr);
        System.out.println(out);
    }
    public static int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);

        if (res< max) res = max;
        }
        return res;
    }
}
