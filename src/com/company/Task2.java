package com.company;

public class Task2 {

  public static void main(String[] args) {
    // Вивести на екран всі числа от 1 до 100, які діляться на 5 без залишку.

    for (int i = 1; i <= 100; i++) {
      if ((i % 5) == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
