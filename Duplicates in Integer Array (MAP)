/*
Time Complexity: O(N)
Auxiliary Space: O(N)
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean dup = false;
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i =0; i< nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i], 1);
            }
        }
        
        for(Entry<Integer, Integer> s : hm.entrySet()){
            if(s.getValue()> 1){
                dup = true;
            }
        }
        if(dup) {return true;}
        else{
            return false;
    }
}}
