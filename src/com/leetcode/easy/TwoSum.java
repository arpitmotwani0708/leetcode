package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class Solution {

  //Searching the complement from i+1 th position O(n log n)
  public int[] twoSum1(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      int searchNum = target - nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] == searchNum)
          return new int[] {i, j};
      }
    }
    return null;
  }

  //Using hashtable(optimized) O(n)
  public int[] twoSum2(int[] nums, int target) {
    Map<Integer, Integer> searchMap = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      int searchNum = target - nums[i];
      if (searchMap.containsKey(searchNum)) {
        return new int[] {searchMap.get(searchNum), i};
      } else {
        searchMap.put(nums[i], i);
      }
    }
    return null;
  }
}


public class TwoSum {

  public static void main(String[] args) {

    Solution solution = new Solution();

    int[] nums1 = {2, 7, 11, 15};
    int target1 = 9;
    int[] nums2 = {3, 2, 4};
    int target2 = 6;
    int[] nums3 = {3, 3};
    int target3 = 6;

    nums1 = solution.twoSum1(nums1, target1);
    nums2 = solution.twoSum1(nums2, target2);
    nums3 = solution.twoSum1(nums3, target3);

    System.out.println(nums1[0] + "---" + nums1[1]);
    System.out.println(nums2[0] + "---" + nums2[1]);
    System.out.println(nums3[0] + "---" + nums3[1]);
  }

}

/*
 * i j [3, 2, 4, 9], target=6
 * 
 * searchNum = 4;
 */
