package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

  private static Map<Character, Integer> romanIntMap;

  static {
    romanIntMap = new HashMap<Character, Integer>();
    romanIntMap.put('I', 1);
    romanIntMap.put('V', 5);
    romanIntMap.put('X', 10);
    romanIntMap.put('L', 50);
    romanIntMap.put('C', 100);
    romanIntMap.put('D', 500);
    romanIntMap.put('M', 1000);
  }

  public static int romanToInt(String s) {
    int num = 0;
    for (int i = 0; i < s.length(); i++) {
      if (i != s.length() - 1
          && (romanIntMap.get(s.charAt(i)) < romanIntMap.get(s.charAt(i + 1)))) {
        num += (romanIntMap.get(s.charAt(i + 1)) - romanIntMap.get(s.charAt(i)));
        i++;
      } else {
        num += romanIntMap.get(s.charAt(i));
      }
    }
    return num;
  }

  public static void main(String[] args) {

    System.out.println(romanToInt("III"));
    System.out.println(romanToInt("LVIII"));
    System.out.println(romanToInt("MCMXCIV"));
    System.out.println(romanToInt("IV"));
    System.out.println(romanToInt("VI"));
    System.out.println(romanToInt("MC"));
  }

}
