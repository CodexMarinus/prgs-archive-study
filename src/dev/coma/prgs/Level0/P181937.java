package dev.coma.prgs.Level0;

// Lv.0 n의 배수
public class P181937 {
  public int solution(int num, int n) {
    return num % n == 0 ? 1 : 0;
  }
}
