package exercises;

import java.util.Random;

public class DonaldsNephews {
  /*
Skriv et program, der udskriver navnene på Anders Ands tre nevøer: Rip, Rap og Rup.
Hvert navn skal udskrives af en separat metode.
I run-metoden skal du nu udskrive tre tilfældige navne på én linje. Java skriver måske: Rup, Rap og Rap.
Det samme navn kan altså optræde 0-3 gange for hver kørsel. Husk at tilføje komma og ”og” i udskriften.
Tilføj en for-løkke, så programmet gør dette 25 gange.
   */

  public static void main(String[] args) {
    new DonaldsNephews().run();
  }

  public void run() {
    for (int j = 0; j < 25; j++) {
      for (int i = 0; i < 3; i++) {
        printRandomName();
        printDelimiter(i);
      }
    }
  }

  public void printRandomName() {
    Random random = new Random();
    int nameIndex = random.nextInt(3);
    switch (nameIndex) {
      case 0 -> printRip();
      case 1 -> printRap();
      case 2 -> printRup();
    }
  }

  public void printDelimiter(int i) {
    if (i == 0)
      System.out.print(", ");
    else if (i == 1)
      System.out.print(" og ");
    else if (i == 2)
      System.out.println(".");
  }

  public void printRip() {
    System.out.print("Rip");
  }

  public void printRap() {
    System.out.print("Rap");
  }

  public void printRup() {
    System.out.print("Rup");
  }
}
