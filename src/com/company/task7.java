package com.company;

public class task7 {

  public static void main(String[] args) {
    //  Відомо, що у заданого вектора Х=(х1, х2, ...., х8) є, мінімум одна від’ємна компонента.
    // Визначити номер першої по порядку від’ємної компоненти.
    int[] arr = {1, -2, 3, 4, 5, -6, 7, 8};
    int i;
    for (i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        break;
      }
    }
    int position = i + 1;
    System.out.println(
        "First negative number in arr have index = "
            + i
            + " position ="
            + position
            + " value = "
            + arr[i]);
  }
}
