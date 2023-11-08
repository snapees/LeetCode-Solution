//using arrays

import java.util.Arrays;

public class ProdArrExSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] nums1 = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelf(nums1)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n  = nums.length;
        int[] ans = new int[n];

        int post=1, pre=1;
        //Calculating the prefix of the array nums and stroing it in ans[]
        for(int i=0; i<n; i++){
            ans[i]=pre;
            pre*=nums[i];
        }
        //Calculating the postfix, simultaneously multiplying it with the prefix and storing the product of prefix and postfix.
        for(int i=n-1; i>=0; i--){
            ans[i]*=post;
            post*=nums[i];
        }
        return ans;
    }
}
