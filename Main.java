import com.codewithkyle.Calculator;
import com.codewithkyle.Console;


public class Main {
  public static void main(String[] args) {
    int miles = (int) Console.readInput("Enter your desired annual miles: ");

    double monthlyMiles = Calculator.calculateMonthlyMiles(miles);
    String monthlyFormatted = String.format("%.2f", monthlyMiles);
    System.out.println("Run " + monthlyFormatted
        + " miles per month to reach your annual goal of "
        + miles + " miles.");

    double weeklyMiles = Calculator.calculateWeeklyMiles(miles);
    String weeklyFormatted = String.format("%.2f", weeklyMiles);
    System.out.println("Run " + weeklyFormatted
        + " miles per week to reach your annual goal of "
        + miles + " miles.");

    double dailyMiles = Calculator.calculateDailyMiles(miles);
    String dailyFormatted = String.format("%.2f", dailyMiles);
    System.out.println("Run " + dailyFormatted
        + " miles per day to reach your annual goal of "
        + miles + " miles.");

  }
}
