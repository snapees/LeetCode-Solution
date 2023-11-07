
// using arrays

import java.util.Arrays;

public class RainWaterTrap {
    public static void main(String[] args) {
        int[] height1 = { 0,1,0,2,1,0,1,3,2,1,2,1 };
        int[] height2 = { 4,2,0,3,2,51 };
        System.out.println("For Example 1: " + Arrays.toString(height1) + " is " + trap(height1));
        System.out.println("For Example 2: " + Arrays.toString(height2) + " is "  + trap(height2));
    }
    public static int trap(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }

        int ans = 0;
        int size = height.length;

        int[] leftMax = new int[size];
        int[] rightMax = new int[size];

        leftMax[0] = height[0];
        for(int i = 1; i < size; i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        rightMax[size-1] = height[size-1];
        for(int i = size-2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }

        for(int i = 1; i < size-1; i++){
            ans+= Math.min(leftMax[i],rightMax[i])-height[i];
        }
        return ans;
    }
}
