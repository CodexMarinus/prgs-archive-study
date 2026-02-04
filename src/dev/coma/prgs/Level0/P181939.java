package dev.coma.prgs.Level0;

// Lv.0 더 크게 합치기
public class P181939 {
  public int solution(int a, int b) {
    return Math.max(Integer.parseInt("" + a + b), Integer.parseInt("" + b + a));
  }
}
