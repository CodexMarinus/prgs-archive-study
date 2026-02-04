package dev.coma.prgs.Level0;

// Lv.0 피자 나눠 먹기(2)
public class P120815 {
  public int solution(int n) {
    int piece = 6;
    int remain = n;
    while (piece % remain != 0) {
      int temp = piece % remain;
      piece = remain;
      remain = temp;
    }

    return n / remain;
  }
}
