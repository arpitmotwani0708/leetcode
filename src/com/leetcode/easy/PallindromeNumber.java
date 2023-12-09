package com.leetcode.easy;

public class PallindromeNumber {

  public static boolean isPalindrome(int num) {
    // find the length of the number
    // using length reverse the number using mathematical logic
    // check if reverse number is equal to original number or not
    if (num < 0)
      return false;
    int number = num;
    int dividedBy = 1;
    while ((number / 10) != 0) {
      dividedBy *= 10;
      number /= 10;
    }
    int reverseNum = 0;
    number = num;

    while (number != 0) {
      reverseNum = reverseNum + (number % 10) * dividedBy;
      dividedBy /= 10;
      number = number / 10;
    }
    return (num == reverseNum);
  }

  public static void main(String[] args) {

    System.out.println(isPalindrome(121));
    System.out.println(isPalindrome(-121));
    System.out.println(isPalindrome(10));

  }

}

