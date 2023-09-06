public class CreateAndNameMethods {
  public static void main(String[] args) {
    new CreateAndNameMethods().run();
  }

  public void run() {
    drinkWater();
    useComputer();
    drinkWater();
    praiseClass();
  }

  public void drinkWater() {
    System.out.println("Drinking water ...");
  }

  public void useComputer() {
    System.out.println("Using computer ...");
  }

  public void praiseClass() {
    System.out.println("Teacher says: You guys ROCK!!");
  }
}
