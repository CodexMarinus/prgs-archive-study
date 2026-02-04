package dev.coma.prgs.Level0;

// Lv.0 공배수
public class P181936 {
  public int solution(int number, int n, int m) {
    return (number % n == 0 && number % m == 0) ? 1 : 0;
  }
}
