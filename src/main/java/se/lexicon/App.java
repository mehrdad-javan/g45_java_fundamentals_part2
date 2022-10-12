package se.lexicon;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
/*
        Person erik = new Person();
        erik.firstName = "Erik";
        erik.lastName = "Svensson";
        erik.age = 42;
        erik.hobby = "Programming";
        System.out.println(erik.getPersonInformation());
        System.out.println(erik.getFullName());


        Person test = new Person();
        test.firstName = "Test";
        test.lastName = "Test";
        test.hobby = "";
        System.out.println(test.getPersonInformation());
        System.out.println(test.getFullName());
*/
    Scanner sc = new Scanner(System.in);
    TestCalculator.displayMenu();
    System.out.println("Enter Operation Type (+ , -)");
    char operationType = sc.next().charAt(0);

    System.out.println("Enter number1: ");
    double n1 = sc.nextInt();
    System.out.println("Enter number2: ");
    double n2 = sc.nextInt();

    switch (operationType) {
      case '+':
        double result = TestCalculator.addition(n1, n2);
        System.out.println(result);
        break;
      case '-':
        System.out.println(TestCalculator.subtraction(n1, n2));
        break;

      default:
        System.out.println("Operation type is not valid!");

    }


  }
}
