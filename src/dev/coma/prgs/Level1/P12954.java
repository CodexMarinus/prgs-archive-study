package dev.coma.prgs.Level1;

// Lv.1 x만큼 간격이 있는 n개의 숫자
public class P12954 {
  public long[] solution(int x, int n) {
    long[] answer = new long[n];
    answer[0] = x;

    for (int i = 1; i < answer.length; i++) {
      answer[i] = answer[i - 1] + x;
    }

    return answer;
  }
}
