package se.lexicon;

import java.util.Scanner;

public class LoopExample {

  // psbm + tab
  public static void main(String[] args) {

    /*
    Scanner scanner= new Scanner(System.in);
    boolean isAdult = true;

    while (isAdult){
      System.out.println("How old are u? ");
      int age = scanner.nextInt();

      if(age >= 18){
        System.out.println("You are an adult!");
      } else {
        System.out.println("You are a child!");
        isAdult = false;
      }
    }
    System.out.println("Bye");
    */


    /*int number = 5;
    do {
      number++;
    } while (number != 0 && number < 5);

    System.out.println(number);

     */

    /*for (int i = 1; i <= 10; i++) {

      if (i == 8){
        continue;
      }

      System.out.println(i); // 1,2 ... 10
      *//*if (i % 2 != 0) {
        System.out.println(i);
      }*//*

     *//*if (i == 6){
        break;
      }*//*



    }*/

    int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};

    for(int number: numbers){
      System.out.println(number);
    }

    String[] names = {"Test1", "Test2", "Test3"};
    for (String name : names){
      System.out.println(name);
    }


  }

}
