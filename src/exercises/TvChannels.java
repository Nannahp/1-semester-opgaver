package exercises;

import java.util.Scanner;

public class TvChannels {
  /*
Skriv et program med en run-metode, der beder brugeren vælge mellem at se tre TV-kanaler (fx DR, TV2 og TV3).
Hver kanal har ”sin egen” metode, som run() kalder jf. brugerens valg. I hver metode skal der være en lokal
String-variabel kaldet currentShow, der fortæller hvad kanalen viser netop nu. Find selv på en titel til hver kanal.
Når brugeren har valgt kanal, skal programmet udskrive teksten Du ser ”The Matrix” på TV2 e.a.
   */

  public static void main(String[] args) {
    new TvChannels().run();
  }

  public void run() {
    printUserMenu();
    int choice = askUserChoice();
    System.out.print("Du ser \"");;
    printCurrentShow(choice);
    System.out.print("\" på ");
    printStationName(choice);
  }

  private void printStationName(int choice) {
    switch (choice) {
      case 1 -> System.out.print("DR.");
      case 2 -> System.out.println("TV2");
      case 3 -> System.out.print("TV3");
      default -> System.out.print("et slukket fjernsyn.");
    }
  }

  private void printCurrentShow(int choice) {
    switch (choice) {
      case 1 -> showDr();
      case 2 -> showTv2();
      case 3 -> showTv3();
    }
  }

  private void printUserMenu() {
    System.out.println("\nWELCOME TO YOUR TV\n");
    System.out.print("""

        Please choose your channel:
        1. DR
        2. TV2
        3. TV3

        Please enter your choice:\s""");
  }

  private int askUserChoice() {
    int choice;
    Scanner in = new Scanner(System.in);
    while (!in.hasNextInt())
      in.nextLine(); // Empty buffer due to illegal entry
    choice = in.nextInt();
    in.nextLine(); // Scanner bug
    return choice;
  }

  public void showDr() {
    String currentShow = "Nyhederne";
    System.out.print(currentShow);
  }

  public void showTv2() {
    String currentShow = "Presselogen";
    System.out.print(currentShow);
  }
  public void showTv3() {
    String currentShow = "Robinson-ekspeditionen";
    System.out.print(currentShow);
  }
}
