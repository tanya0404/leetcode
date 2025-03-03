import java.util.Arrays;
import java.util.Scanner;

public class day1 {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merg=new int[nums1.length + nums2.length];
        for(int i=0;i<nums1.length;i++){
            merg[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            merg[nums1.length+i]=nums2[i];
        }
        Arrays.sort(merg);
        int n = merg.length;
        if (n % 2 == 1) {
            return merg[n / 2]; 
        } else {
            return (merg[n / 2 - 1] + merg[n / 2]) / 2.0; 
        }
}








class Solution {
    public int[] twoSum(int[] nums, int target) {
      for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
        }
      }
        return new int[]{};

    }
}

}







