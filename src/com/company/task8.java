package com.company;

public class task8 {

  public static void main(String[] args) {
    //  Написати програму підрахунку числа компонент вектора Х=(х1, х2, ...., х17), які
    // задовільняють умову нерівності |хi|>=m, m=1.
    int[] arr = {1, -2, 3, 4, 5, -6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
    int m = 1;
    int counter = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= m) {
        counter++;
      }
    }
    System.out.println(counter + " items that |хi|>=m");
  }
}
