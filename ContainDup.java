import java.util.Arrays;

public class ContainDup {
    public static void main(String[] args) {
        int[] a = { 1,1,1,3,3,4,3,2,4,2 };
        boolean res = containsDuplicate(a);
        System.out.println(res);
    }

    public static boolean containsDuplicate(int[] nums){

//        int n = nums.length;
//        for (int i = 0; i < n-1; i++) {
//            for (int j = i+1; j < n; j++) {
//
//                if (nums[i] == nums[j]){
//                    return  true;
//                }
//            }
//        }
//        return false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}
