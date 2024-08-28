package exercises;

public class ReturnValueDemo {
  public static void main(String[] args) {
    new ReturnValueDemo().run();
  }

  public void run() {
    System.out.println(calculateSum(2, 3));
    String myFullName = fullName("Pat", "JavaMaster");
    System.out.println(myFullName);
    System.out.println(fullName("Anders", "And"));
    System.out.print("Square root of 205 is " + calculateSquareRoot(205));
  }

  public int calculateSum(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
  }

  public String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public double calculateSquareRoot(double number) {
    return Math.sqrt(number);
  }
}
