package exercises;

public class PrintMyNames {
  /*
Skriv et program, der kan udskrive dit fornavn, dit efternavn og dit mellemnavn (hvis du ikke har et mellemnavn,
bruger du bare mellemnavnet JavaMaster – det må du i øvrigt også gerne, hvis du bare synes at dette er sejere
end dit faktiske mellemnavn ). Skriv programmet sådan, at du opretter metoderne:
printFirstName()
printMiddleName()
printLastName()
De skal alle hedde public void før metodenavnet.
main-metoden skal gøre ligesom i opgave 1 (for sådan gør vi konsekvent fremover nu!).
I run-metoden kan du nu kalde de tre print-metoder i den rækkefølge du ønsker. Kør programmet med
forskellige kombinationsmuligheder, fx:
• Patrick JavaMaster Agergaard
• Agergaard, Patrick JavaMaster (bemærk kommaet – hvor vil du placere det i koden?)
• Patrick (JavaMaster) Agergaard (en tilsvarende overvejelse om parantesen)
   */

  public static void main(String[] args) {
    new PrintMyNames().run();
  }

  public void run() {
    printLastName();
    System.out.print(", ");
    printFirstName();
    System.out.print(" ");
    printMiddleName();
  }

  public void printFirstName() {
    System.out.print("Donald");
  }

  public void printMiddleName() {
    System.out.print("JavaMaster");
  }

  public void printLastName() {
    System.out.print("Duck");
  }
}
