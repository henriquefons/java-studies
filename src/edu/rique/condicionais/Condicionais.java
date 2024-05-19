package edu.rique.condicionais;

public class Condicionais {
  public static void main(String[] args) {
    double myBalance = 100.00;
    double bikeValue = 121.00;

    if (myBalance >= bikeValue) {
      myBalance = myBalance - bikeValue;
      System.out.println("Novo saldo: " + myBalance);
    } else if (bikeValue - myBalance <= 20) {
      myBalance = myBalance + 20;
      myBalance = myBalance - bikeValue;
      System.out.println("Eu te emprestei vintao para completar seu saldo. Seu novo saldo: " + myBalance);
    } else {
      System.out.println("Voce está liso!");
    }
  }
}
