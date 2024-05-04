package edu.rique.sintaxejava;

public class VarTypes {
  public static void main(String[] args) {
    final String CANT_CHANGE = "Não posso ser modificado";
    final double PI = 3.14;
    System.out.println(CANT_CHANGE);
    System.out.println(PI);

    int positiveNumber = -5;
    positiveNumber = +positiveNumber; // forma incorreta
    System.out.println(positiveNumber);
    positiveNumber = positiveNumber * -1; // forma correta
    System.out.println(positiveNumber);

    positiveNumber++;
    System.out.println(positiveNumber);

    boolean isSenior = true;
    System.out.println(isSenior ? "Henrique é o brabo" : "Estude mais");

    String name1 = "teste";
    String name2 = "teste";
    System.out.println(name1 == name2);

    String name3 = new String("teste");
    System.out.println(name1.equals(name3)); // name1 == name3 não funfa
  }
}
