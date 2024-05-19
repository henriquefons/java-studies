package edu.rique.desafios.ControleDeFluxo;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o primeiro número!");
    int firstNumber = scanner.nextInt();

    System.out.println("Por favor, digite o sugundo número!");
    int secondNumber = scanner.nextInt();

    try {
      contar(firstNumber, secondNumber);
    } catch (Exception e) {
      System.out.println("O primeiro numero nao pode ser maior que o segundo!!");
    }
  }

  static void contar(int firstNumber, int secondNumber) throws ParametrosInvalidosException {
    if (firstNumber >= secondNumber) throw new ParametrosInvalidosException();

    for (int i = 1; i <= secondNumber - firstNumber; i++) {
      System.out.println(i);
    }
  }
}
