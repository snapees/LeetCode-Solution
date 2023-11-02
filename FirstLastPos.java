import java.util.Arrays;

public class FirstLastPos {
    public static void main(String[] args) {
        int[] num = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] res = searchRange(num, target);
        System.out.println(Arrays.toString(res));
    }
    
    public static int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums, target), last(nums, target)};
    }
    
    public static int first(int[] nums, int target){
        int ans = -1, low = 0, high = nums.length-1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid] == target){
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return  ans;
    }

    public static int last(int[] nums, int target){
        int ans = -1, low = 0, high = nums.length-1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid] == target){
                ans = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return  ans;
    }

}
