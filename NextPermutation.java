public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        nextPermutation(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length, i, j;
        for (i = n-2; i >= 0; i--) {
            if (nums[i] < nums[i+1]){
                break;
            }
        }

        if (i < 0){
            reverse(nums, 0, n - 1);
        }

        else {
            for (j = n - 1; j > i; j--) {
                if (nums[j] > nums[i]){
                    break;
                }
            }
            swap(nums, i, j);
            reverse(nums, i+1, n-1);
        }
    }

    static void reverse(int[] nums, int start, int end){
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
