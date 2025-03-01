//https://leetcode.com/problems/apply-operations-to-an-array/description/?envType=daily-question&envId=2025-03-01
//Topics: arrays, two-pointers
class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++) {
            if(nums[i]==nums[i+1]) {
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        // int[] res=new int[n];
        // int i=0;
        // for(int j=0;j<n;j++)
        // {
        //     if(nums[j]!=0) {
        //         res[i++]=nums[j];
        //     }
        // }
        //return res;
        
        //Optimal approach for moving zeroes to the end of the array
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
            {
                j=i;
                break;
            }
        }
        if(j==-1) return nums;
        for(int i=j+1;i<n;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
}
