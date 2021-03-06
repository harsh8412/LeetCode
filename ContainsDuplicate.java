/* 
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
*/


import java.util.*;

class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(numMap.containsKey(nums[i])){
                return true;
            }
            numMap.put(nums[i], i);
        }
        return false;
    }

    public static void main(String args[]){
        int[] nums= new int[]{1,2,3,1}; // INPUT HERE
        System.out.println(containsDuplicate(nums));
    }
}