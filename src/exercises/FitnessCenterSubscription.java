package exercises;

import java.util.Scanner;

public class FitnessCenterSubscription {
/*
Fitness center subscription
Skriv et program, der kan bruges i et fitnesscenter til at udregne et medlems abonnementspris.
Brugeren skal indtaste de nødvendige oplysninger, hvorefter programmet skal fortælle hvad prisen bliver.
Grundprisen er 300 kr. om måneden, men der gives rabat jf. nedenstående.

• Studerende får 40 % rabat.
• Pensionister får 20 % rabat.
• Efter tre måneders medlemsskab sparer man 5 % og efter seks måneder 10 %.
• Hvis man er passivt medlem, betaler man 25 kr. om måneden uanset rabatter.
• I den måned, hvor man har fødselsdag, sparer man 15 %.
• For hver 12 måneders medlemskab, sparer man 25 % dén måned (altså efter 1 år, 2 år osv.)

Byg programmet op ved hjælp af små, specialiserede metoder.
*/

  public static void main(String[] args) {
    new FitnessCenterSubscription().run();
  }

  private void run() {
    double priceInDkk;

    printWelcomeMessage();
    boolean isPassiveMember = askQuestion("Are you a passive member (yes/no)? ").equals("yes");
    if (isPassiveMember)
      priceInDkk = 25;
    else {
      priceInDkk = setInitialPrice();
      priceInDkk = deductStudentDiscount(priceInDkk);
      priceInDkk = deductSeniorDiscount(priceInDkk);
      priceInDkk = deductMonthBasedDiscounts(priceInDkk);
    }
    printFinalPrice(priceInDkk);
  }

  private void printFinalPrice(double priceInDkk) {
    System.out.printf("\nThis month's subscription price is %.2f", priceInDkk);
  }

  private double deductBirthDayMonthDiscount(double price) {
    if (askQuestion("Is this your birthday month (yes/no)? ").equals("yes"))
      return price *= 0.85;
    else
      return price;
  }

  private double deductMonthBasedDiscounts(double price) {
    int numberOfMonths = Integer.parseInt(askQuestion("How many months have you been a member? "));
    if (numberOfMonths % 12 == 0) // Todo: Take 0 months into account
      price = deductTwelveMonthsDiscount(price);
    if (numberOfMonths >= 6)
      price *= 0.9;
    else if (numberOfMonths >= 3)
      price *= 0.95;
    return price;
  }

  private double deductBirthdayMonthDiscount(double priceInDkk) {
    return priceInDkk * 0.85;
  }

  private double deductTwelveMonthsDiscount(double price) {
    return price * 0.75;
  }

  private double deductThreeMonthsDiscount(double price) {
      return price * 0.95;
  }

  private double deductSixMonthsDiscount(double price) {
    return price * 0.9;
  }

  private double deductSeniorDiscount(double price) {
    boolean isRetired = askQuestion("Are you retired (yes/no)? ").equals("yes");
    if (isRetired)
      return price * 0.80;
    else
      return price;
  }

  private double deductStudentDiscount(double price) {
    boolean isStudent = askQuestion("Are you a student (yes/no)? ").equals("yes");
    if (isStudent)
      return price * 0.60;
    else
      return price;
  }

  private double setInitialPrice() {
    return 300;
  }

  private String askQuestion(String question) {
    Scanner in = new Scanner(System.in);
    System.out.print(question);
    return in.nextLine();
  }

  private void printWelcomeMessage() {
    System.out.println("\nWELCOME TO CHEAP FITNESS");
    System.out.println("- get ripped without getting ripped!\n");
  }
}
