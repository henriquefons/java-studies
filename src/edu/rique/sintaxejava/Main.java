package edu.rique.sintaxejava;

public class Main {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    System.out.println(smartTv.turn);
    smartTv.turnOn();
    System.out.println(smartTv.turn);

    System.out.println(smartTv.volume);
    smartTv.increaseVolume();
    smartTv.increaseVolume();
    System.out.println(smartTv.volume);

    System.out.println(smartTv.channel);
    smartTv.changeChannel(30);
    System.out.println(smartTv.channel);
  }
}