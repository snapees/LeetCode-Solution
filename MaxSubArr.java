
// Array Example

public class MaxSubArr {

//    using dynamic problem
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[20];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int out = maxSubArray(arr);
//        System.out.println(out);
//
//    }
//        public static int maxSubArray(int[] nums) {
//            int res = nums[0];
//            int temp = nums[0];
//            for (int i = 1; i < nums.length; i++) {
//                temp = Math.max(nums[i], temp + nums[i]);
//                res = Math.max(res, temp);
//            }
//            return res;
//        }

// using Kadne Algorithm
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is "
                + maxSubArraySum(a));
    }

    static int maxSubArraySum(int[] a){
        int n = a.length;
        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int i = 0; i < n; i++) {
            end = end + a[i];
            if (start < end) start = end;
            if (end < 0) end = 0;
        }
        return start;
    }
}
