package com.codewithkyle;

public class LeapYearCalculator {
  public static boolean isLeapYear(int year) {
    boolean is_leap_year = false;

    if (year % 4 == 0) {
      is_leap_year = true;

      if (year % 100 == 0) {
        if (year % 400 == 0) {
          is_leap_year = true;
        } else {
          is_leap_year = false;
        }
      }
    }

    else {
      is_leap_year = false;
    }

    return is_leap_year;
  }
}
