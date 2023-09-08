package exercises;

import dk.patware.utils.ConsoleColors; // Change to your own or delete line and add ConsoleColors class to source
import java.util.Scanner;

public class BmiCalculator {
  public static void main(String[] args) {
    new BmiCalculator().run();
  }

  public void run() {
    printWelcomeMessage();
    int heightInCm;
    double weightInKg;
    double bmi;

    heightInCm = (int)(promptUser("Please enter height in cm: "));
    weightInKg = promptUser("Please enter weight in kg: ");
    bmi = calculateBmi(heightInCm, weightInKg);
    printBmiAndCategory(bmi);
  }

  private void printWelcomeMessage() {
    System.out.println(ConsoleColors.PURPLE + "\nBMI CALCULATOR");
    System.out.println("-".repeat(14));
    System.out.println(ConsoleColors.RESET);
  }

  public double promptUser(String question) {
    double reply;
    Scanner in = new Scanner(System.in);

    System.out.print(question);
    while (! in.hasNextDouble())
      in.nextLine(); // Ignore non-double replies

    reply = in.nextDouble();
    in.nextLine();
    return reply;
  }

  public double calculateBmi(int heightInCm, double weightInKg) {
    return weightInKg / Math.pow(((double)heightInCm / 100), 2);
  }

  public void printBmiAndCategory(double bmi) {
    System.out.printf("Your BMI is %.1f and you are ", bmi);
    if (bmi < 18.5)
      System.out.println(ConsoleColors.RED + "underweight.");
    else if (bmi < 25)
      System.out.println(ConsoleColors.GREEN + "normal weight.");
    else if (bmi < 30)
      System.out.println(ConsoleColors.YELLOW + "overweight.");
    else
      System.out.println(ConsoleColors.RED + "Obese.");
    System.out.println(ConsoleColors.RESET); // Reset output color
  }
}
