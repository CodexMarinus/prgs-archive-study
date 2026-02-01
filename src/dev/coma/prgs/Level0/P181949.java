package dev.coma.prgs.Level0;

import java.util.Scanner;

// Lv.0 대소문자 바꿔서 출력하기
public class P181949 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    for (char c : a.toCharArray()) {
      if (Character.isUpperCase(c)) System.out.print(Character.toLowerCase(c));
      else System.out.print(Character.toUpperCase(c));
    }
  }
}
