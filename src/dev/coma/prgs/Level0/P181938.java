package dev.coma.prgs.Level0;

// Lv.0 두 수의 연산값 비교하기
public class P181938 {
  public int solution(int a, int b) {
    return Math.max(Integer.parseInt("" + a + b), (2 * a * b));
  }
}
