package exercises;

public class HelloRunner {
  /*
Hello, Runner! (metoder)
Skriv et ”Hello world”-agtigt program baseret på den nye skabelon med en run()-metode:

• main() må kun indeholde et statement: new HelloRunner().run();
• public void run()-metoden skal bare udskrive ”Hello, Runner!” på skærmen.

Fra og med i dag benytter du denne fremgangsmåde i opgaverne. main() må aldrig indeholde mere end dette.
Al kode skal skrives i run() og evt. øvrige metoder.
   */

  public static void main(String[] args) {
    new HelloRunner().run();
  }

  public void run() {
    System.out.println("Hello, Runner!");
  }
}
