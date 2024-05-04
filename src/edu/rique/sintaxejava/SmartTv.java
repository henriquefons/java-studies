package edu.rique.sintaxejava;

public class SmartTv {
  boolean turn = false;
  int channel = 1;
  int volume = 25;

  public void turnOn() {
    turn = true;
  }

  public void turnOff() {
    turn = false;
  }

  public void increaseVolume() {
    volume++;
  }

  public void decreaseVolume() {
    volume--;
  }

  public void changeChannel(int newChannel) {
    channel = newChannel;
  }
}
