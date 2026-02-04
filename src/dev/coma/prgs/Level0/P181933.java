package dev.coma.prgs.Level0;

// Lv.0 flag에 따라 다른 값 반환하기
public class P181933 {
  public int solution(int a, int b, boolean flag) {
    return flag ? a + b : a - b;
  }
}
