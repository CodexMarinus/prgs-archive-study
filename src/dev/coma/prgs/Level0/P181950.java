package dev.coma.prgs.Level0;

import java.util.Scanner;

// Lv.0 문자열 반복해서 출력하기
public class P181950 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();

    System.out.print(str.repeat(n));
  }
}
