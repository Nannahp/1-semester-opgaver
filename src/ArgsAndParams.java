import java.util.Scanner;

public class ArgsAndParams {
  public static void main(String[] params) {
    new ArgsAndParams().run();
  }

  public void run() {
    Scanner in = new Scanner(System.in);
    printText("Hey you!", 9);
    System.out.print("Please enter text: ");
    String name = in.nextLine();
    printText(name, (int)23.3);
  }

  public void printText(String text, int age) {
    System.out.println("[" + text + ", " + age + "yo]");
  }
}
