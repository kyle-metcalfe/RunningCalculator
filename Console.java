package com.codewithkyle;

import java.util.Scanner;

public class Console {
  private static Scanner scanner = new Scanner(System.in);

  public static int readInput(String prompt) {
    System.out.print(prompt);
    return scanner.nextInt();
  }
}
