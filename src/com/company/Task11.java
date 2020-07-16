package com.company;

public class Task11 {

  public static void main(String[] args) {
    // Дано масив В розмірності n*m. Визначити, чи є в матриці стовбці які складаються з нульових
    // елементів.
    int[][] b = {
      {1, -2, 3, -4, -5, 0},
      {-6, 7, 8, 9, 10, 0},
      {11, 12, 13, 14, 15, 0},
      {16, 17, 18, 19, 20, 0},
      {21, 22, 23, 24, -25, 0}
    };
    System.out.println("b =");
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b[i].length; j++) {
        System.out.print(" " + b[i][j]);
      }
      System.out.println();
    }
    int counter = 0;
    for (int i = 0; i < b[0].length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (b[j][i] == 0) {
          counter++;
        }
      }
      if (counter == b.length) {
        System.out.println("true");
        break;
      }
    }
  }
}
