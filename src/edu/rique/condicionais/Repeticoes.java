package edu.rique.condicionais;

public class Repeticoes {
  public static void main(String[] args) {
    String students[] = {"teste1", "teste2", "teste3"};
    System.out.println(students[1]);
    for (int index = 0; index < students.length; index++) {
      System.out.println(students[index]);
    }

    for (String student : students) {
      System.out.println("" + student);
    }
  }
}
