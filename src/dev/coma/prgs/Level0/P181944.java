package dev.coma.prgs.Level0;

import java.util.Scanner;

// Lv.0 홀짝 구분하기
public class P181944 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.print(n + (n % 2 == 0 ? " is even" : " is odd"));
  }
}
