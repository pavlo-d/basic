package com.company;

public class task5 {

  public static void main(String[] args) {
    //  Здійнити дзеркальний переворот елементів в масиві ([1, 2, 3, 4] -> [4, 3, 2, 1]).
    int[] arr = {1, 2, 3, 4};
    int[] arrReverse = new int[4];

    for (int i = 0; i < 4; i++) {
      arrReverse[3 - i] = arr[i];
    }
    System.out.print("arr = ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.print("arrReverse = ");
    for (int i : arrReverse) {
      System.out.print(i + " ");
    }
  }
}
