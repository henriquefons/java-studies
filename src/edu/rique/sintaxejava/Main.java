package edu.rique.sintaxejava;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println(1 + 2 * 2.1);
    System.out.println(fullName("Henrique", "2"));

  }

  public static String fullName(String firstName, String lastName) {
    return firstName + ' ' + lastName;
  }
}