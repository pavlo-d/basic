package com.company;

public class Task9 {

  public static void main(String[] args) {
    //  Якщо в масиві А(20) є елемент рівний квадрату останнього елемента, то всі елементи
    // розташовані після такого елемента піднести до квадрата, інкакше залишити масив без изменения.
    int[] a = {1, -2, 3, 4, 5, -6, 7, 8, 9, 10, 10, 100, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.print("A = ");
    for (int i : a) {
      System.out.print(i + " ");
    }
    int indexElement = -1;
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] == a[a.length - 1] * a[a.length - 1]) {
        indexElement = i;
        break;
      }
    }
    for (int i = indexElement + 1; i < a.length; i++) {
      a[i] = a[i] * a[i];
    }
    System.out.println();
    System.out.println("**********");
    System.out.print("A = ");
    for (int i : a) {
      System.out.print(i + " ");
    }
  }
}
