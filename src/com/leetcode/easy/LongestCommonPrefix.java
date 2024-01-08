package com.leetcode.easy;

public class LongestCommonPrefix {

  public static String longestCommonPrefix(String[] strs) {
    String result = "";
    String stringToCompare = strs[0];

    for (int compareIndex = 0; compareIndex < stringToCompare.length(); compareIndex++) {
      for (int i = 1; i < strs.length; i++) {
        if (compareIndex>=strs[i].length() || stringToCompare.charAt(compareIndex) != strs[i].charAt(compareIndex)) {
          return result;
        }
      }
      result += String.valueOf(stringToCompare.charAt(compareIndex));
    }
    return result;
  }


  public static void main(String[] args) {

    System.out.println(">" + longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
    System.out.println(">" + longestCommonPrefix(new String[] {"dog", "racecar", "car"}));
    System.out.println(">" + longestCommonPrefix(new String[] {"ab", "a"}));
    System.out.println(">" + longestCommonPrefix(new String[] {"abc", "ab"}));
    System.out.println(">" + longestCommonPrefix(new String[] {"a"}));
    System.out.println(">" + longestCommonPrefix(new String[] {"flower", "flower", "flower", "flower"}));
    System.out.println(">" + longestCommonPrefix(new String[] {"", ""}));
  }

}
