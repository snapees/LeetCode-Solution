public class RotSortArray {
    public static void main(String[] args) {
        int[] num = { 4,5,6,7,0,1,2 };

        int target = 0; // Number of students
        int target2 = 2;

//        int n = num.length;
        System.out.println("using binary search method");
        System.out.println(search(num, target));
        System.out.println("using linear search method");
        System.out.println(searchl(num, target2));
    }


    public static int search(int[] nums, int target) {
//        using binary search method
        int left = 0;
        int right = nums.length -1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target) return mid;
            if (nums[left] <= nums[mid]){
                if (target >= nums[left] && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target >= nums[mid] && target <= nums[right]) {
                    left = mid + 1 ;
                }
                else {
                    right = mid+1;
                }
            }
        }
        return -1;
    }

    public static int searchl(int[] nums, int target2) {
        //        using lenaer search method
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            if (target2 == nums[i]){
                return i;
            }
        }
        return -1;
    }
}
