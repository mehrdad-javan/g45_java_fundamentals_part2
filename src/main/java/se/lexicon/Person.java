package se.lexicon;

public class Person {

  // fields
  String firstName;
  String lastName;
  int age;
  String hobby;

  //methods
  public String getPersonInformation(){
    return firstName + " " + lastName + " is " + age + " years old and likes " + hobby;
  }

  public String getFullName(){
    return firstName + " " + lastName;
  }


}
