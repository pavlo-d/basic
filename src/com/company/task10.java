package com.company;

public class task10 {

  public static void main(String[] args) {
    //   Дано масив А[5,5]. Отримати масив В(5) за наступними правилами: В(і)=1 якщо в і-ому рядку
    // масива є хоча б один від’ємний элемент, інакше В(і)=0.
    int[][] a = {
      {1, -2, 3, -4, -5},
      {-6, 7, 8, 9, 10},
      {11, 12, 13, 14, 15},
      {16, 17, 18, 19, 20},
      {21, 22, 23, 24, -25}
    };
    int[] b = new int[5];
    System.out.println("a =");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(" " + a[i][j]);
      }
      System.out.println();
    }
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] < 0) {
          b[i] = 1;
          break;
        }
      }
    }
    System.out.println("b =");
    for (int i = 0; i < b.length; i++) {
      System.out.print(" " + b[i]);
    }
  }
}
