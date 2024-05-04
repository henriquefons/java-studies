package edu.rique.sintaxejava;

import java.util.Locale;
import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite alguma coisa");
    double something = scanner.nextDouble();

    System.out.println("O dobro do valor digitado é: " + calcDouble(something));
  }

  static double calcDouble(double number) {
    return number * 2;
  }
}
