package com.company;

public class task4 {

  public static void main(String[] args) {
    // Знайти в массиві чисел елементі с найбільшим (max) та найменшим (min) значеннями. Вивести ці
    // 2 елемента на екран, а також порахувати і вивести суму всіх решти елементі (min та max в суму
    // не входять).
    int[] arr = {1, 2, 3, 4, -5, 6, 7, 8, 9, 10};
    int min = arr[0];
    int max = arr[0];
    int sum = 0;

    for (int i = 0; i <= 9; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
      sum = sum + arr[i];
    }
    sum = sum - min - max;
    System.out.println("min = " + min);
    System.out.println("max = " + max);
    System.out.println("sum = " + sum);
  }
}
