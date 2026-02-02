package dev.coma.prgs.Level0;

import java.util.Scanner;

// Lv.0 덧셈식 출력하기
public class P181947 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.printf("%s + %s = %s", a, b, a + b);
  }
}
