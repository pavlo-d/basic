package com.company;

public class Task6 {

  public static void main(String[] args) {
    //  Знайти в масиві число яке повторюється найчастіше.
    int[] arr = {2, 2, 3, 4, 1, 2, 1, 1, 1, 5, 5, 1, 1, 3, 1, 1};
    int[] arrDuplicates = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          arrDuplicates[i]++;
        }
      }
    }
    System.out.print("A = ");
    for (int item : arr) {
      System.out.print(item + " ");
    }
    int max = 0;
    for (int i = 0; i < arrDuplicates.length; i++) {
      if (arrDuplicates[i] > max) {
        max = arrDuplicates[i];
      }
    }
    System.out.println();
    System.out.println("Number " + arr[max] + " frequency = " + max);
  }
}
