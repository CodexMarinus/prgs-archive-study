package dev.coma.prgs.Level0;

// Lv.0 피자 나눠 먹기(1)
public class P120814 {
  public int solution(int n) {
    return n % 7 == 0 ? n / 7 : n / 7 + 1;
  }
}
