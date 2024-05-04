package edu.rique.desafios.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da Agência !");
    int agencyNumber = scanner.nextInt();

    System.out.println("Por favor, digite a conta da Agência !");
    String agencyAccount = scanner.next();

    System.out.println("Por favor, digite o nome do cliente !");
    String client = scanner.next();

    System.out.println("Por favor, digite o saldo do cliente !");
    double balance = scanner.nextDouble();

    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque", client, agencyNumber, agencyAccount, balance);
  }

  static double calcDouble(double number) {
    return number * 2;
  }
}
