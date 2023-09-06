import java.util.Scanner;

public class BmiCalculator {
  public static void main(String[] args) {
    new BmiCalculator().run();
  }

  public void run() {
    int heightInCm;
    double weightInKg;

    askUserDetails();
  }

  public void askUserDetails() {
    int heightInCm;
    double weightInKg;
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter height in cm: ");
    heightInCm = in.nextInt();
    in.nextLine(); // Scanner bug
    System.out.print("Please enter weight in kg: ");
    weightInKg = in.nextDouble();
    in.nextLine(); // Scanner bug

    calculateBmi(heightInCm, weightInKg);
  }

  public void calculateBmi(int heightInCm, double weightInKg) {
    double bmi = weightInKg / Math.pow(((double)heightInCm / 100), 2);
    System.out.printf("Your BMI is %.1f and you are ", bmi);
    if (bmi < 18.5)
      System.out.println("underweight");
    else if (bmi < 25)
      System.out.println("normal weight");
    else if (bmi < 30)
      System.out.println("overweight");
    else
      System.out.println("Obese");
  }
}
