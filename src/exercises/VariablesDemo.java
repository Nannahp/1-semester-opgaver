package exercises;

public class VariablesDemo {
  public static void main(String[] args) {
    new VariablesDemo().run();
  }

  public void run() {
    doThat();
    doThis();
  }

  public void doThis() {
    int number = 5;
    System.out.println("Do this. Number = " + number);
    for (int i = 0; i < number; i++) {
      System.out.println("i = " + i);
      // int number = 0; Nope, cannot have duplicate variable names.
    }
  }

  public void doThat() {
    int number = 13;
    System.out.println("Do that" + number);
  }

}
