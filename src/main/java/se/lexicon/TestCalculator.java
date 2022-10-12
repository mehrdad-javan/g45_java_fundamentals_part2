package se.lexicon;

public class TestCalculator {

  public static double addition(double num1, double num2) {
    return num1 + num2;
  }

  public static double subtraction(double num1, double num2) {
    return num1 - num2;
  }


  public static void displayMenu() {
    System.out.println("### Welcome to my first java app ### ");
    System.out.println("+. Addition");
    System.out.println("-. Subtraction");
    System.out.println("#####################################");
  }

  public static void main(String[] args) {
    System.out.println(TestCalculator.addition(10, 20));
  }


}
