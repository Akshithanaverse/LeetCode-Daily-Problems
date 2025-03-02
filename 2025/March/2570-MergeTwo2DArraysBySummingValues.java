//https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/
//Brute Force 
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int m=nums1.length;
        int n=nums2.length;
        for(int i=0;i<m;i++)
        {
            map.put(nums1[i][0],nums1[i][1]);
        }
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums2[i][0]))
            {
                map.put(nums2[i][0],map.get(nums2[i][0])+nums2[i][1]);
            }
            else
            {
                map.put(nums2[i][0],nums2[i][1]);
            }
        }
        TreeMap<Integer,Integer> sorted=new TreeMap<>(map);
        int idx=0;
        int[][] res=new int[map.size()][2];
        for(Map.Entry<Integer,Integer> entry:sorted.entrySet()){
            res[idx][0]=entry.getKey();
            res[idx][1]=entry.getValue();
            idx++;
        }
        return res;
    }
}
