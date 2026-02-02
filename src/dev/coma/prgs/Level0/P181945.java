package dev.coma.prgs.Level0;

import java.util.Scanner;

// Lv.0 문자열 돌리기
public class P181945 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    for (char c : a.toCharArray()) {
      System.out.println(c);
    }
  }
}
