package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static void main(String[] args) {

    int[] nums1 = {2, 7, 11, 15};
    int target1 = 9;
    int[] nums2 = {3, 2, 4};
    int target2 = 6;
    int[] nums3 = {3, 3};
    int target3 = 6;

    nums1 = twoSum1(nums1, target1);
    nums2 = twoSum1(nums2, target2);
    nums3 = twoSum1(nums3, target3);

    System.out.println(nums1[0] + "---" + nums1[1]);
    System.out.println(nums2[0] + "---" + nums2[1]);
    System.out.println(nums3[0] + "---" + nums3[1]);
  }

  // Searching the complement from i+1 th position O(n log n)
  private static int[] twoSum1(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      int searchNum = target - nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] == searchNum)
          return new int[] {i, j};
      }
    }
    return null;
  }

  // Using hashtable(optimized) O(n)
  @SuppressWarnings("unused")
  private static int[] twoSum2(int[] nums, int target) {
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
