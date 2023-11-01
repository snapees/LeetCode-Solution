import java.util.Scanner;

public class MaxSubArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[20];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int out = maxSubArray(arr);
        System.out.println(out);

    }
        public static int maxSubArray(int[] nums) {
            int res = nums[0];
            int temp = nums[0];
            for (int i = 1; i < nums.length; i++) {
                temp = Math.max(nums[i], temp + nums[i]);
                res = Math.max(res, temp);
            }
            return res;
        }
}
