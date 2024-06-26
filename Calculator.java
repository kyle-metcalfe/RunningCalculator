package com.codewithkyle;

import java.time.LocalDate;

public class Calculator {
  private final static int monthsPerYear = 12;
  private final static int weeksPerYear = 52;
  private final static int daysPerYear = 365;
  private final static int daysPerLeapYear = 366;

  private final int miles;

  public Calculator(int miles) {
    this.miles = miles;
  }

  public static double calculateMonthlyMiles(int miles) {
    return (double) miles / monthsPerYear;
  }

  public static double calculateWeeklyMiles(int miles) {
    return (double) miles / weeksPerYear;
  }

  public static double calculateDailyMiles(int miles) {
    int year = getYear();
    if (LeapYearCalculator.isLeapYear(year)) {
      return (double) miles / daysPerLeapYear;
    }
    else
      return (double) miles / daysPerYear;
  }

  public static int getYear() {
    int currentYear = LocalDate.now().getYear();
    return currentYear;
  }
}
