/* 
Time Complexity: O(N2) 
Auxiliary Space: O(N)
*/


class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean isdup = false;
        for(int i = 0; i<nums.length-1; i++){
           for(int j = i+1; j<nums.length; j++) {
               if(nums[i] == nums[j])
                   return true;
            }
        }
        
            return false;
    }
}
