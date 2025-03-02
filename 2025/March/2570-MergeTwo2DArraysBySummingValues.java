//https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/
//Brute Force 
// class Solution {
//     public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int m=nums1.length;
//         int n=nums2.length;
//         for(int i=0;i<m;i++)
//         {
//             map.put(nums1[i][0],nums1[i][1]);
//         }
//         for(int i=0;i<n;i++)
//         {
//             if(map.containsKey(nums2[i][0]))
//             {
//                 map.put(nums2[i][0],map.get(nums2[i][0])+nums2[i][1]);
//             }
//             else
//             {
//                 map.put(nums2[i][0],nums2[i][1]);
//             }
//         }
//         TreeMap<Integer,Integer> sorted=new TreeMap<>(map);
//         int idx=0;
//         int[][] res=new int[map.size()][2];
//         for(Map.Entry<Integer,Integer> entry:sorted.entrySet()){
//             res[idx][0]=entry.getKey();
//             res[idx][1]=entry.getValue();
//             idx++;
//         }
//         return res;
//     }
// }

//Better Approach
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int[]> list=new ArrayList<>();
        int m=nums1.length;
        int n=nums2.length;
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(nums1[i][0]==nums2[j][0])
            {
                list.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                list.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
            }
            else
            {
                list.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;
            }
        }
        while(i<m)
        {
            list.add(new int[]{nums1[i][0],nums1[i][1]});
            i++;
        }
        while(j<n)
        {
            list.add(new int[]{nums2[j][0],nums2[j][1]});
            j++;
        }
        return list.toArray(int[][]:: new);
    }
}
