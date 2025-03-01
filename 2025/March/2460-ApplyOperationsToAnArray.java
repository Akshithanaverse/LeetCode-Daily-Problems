//https://leetcode.com/problems/apply-operations-to-an-array/description/?envType=daily-question&envId=2025-03-01
class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++) {
            if(nums[i]==nums[i+1]) {
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int[] res=new int[n];
        int i=0;
        for(int j=0;j<n;j++)
        {
            if(nums[j]!=0) {
                res[i++]=nums[j];
            }
        }
        return res;
    }
}
