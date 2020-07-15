package com.company;

public class task1 {

  public static void main(String[] args) {
    // Вивести на екран числа від -10 до 25 за допомогою всіх відомих циклів.

    for (int i = -10; i <= 25; i++) {
      System.out.print(i + " ");
    }
    System.out.println("");
    int counter = -10;
    do {
      System.out.print(counter + " ");
      counter++;
    } while (counter <= 25);
    System.out.println("");
    counter = -10;
    while (counter <= 25) {
      System.out.print(counter + " ");
      counter++;
    }
  }
}
