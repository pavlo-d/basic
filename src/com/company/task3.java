package com.company;

public class task3 {

  public static void main(String[] args) {
    // Заповнити масив short типу числами від 100 до 0.
    short[] arr = new short[101];

    for (short i = 0; i <= 100; i++) {
      arr[100 - i] = i;
    }

    System.out.println("");
    for (int i = 0; i <= 100; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
