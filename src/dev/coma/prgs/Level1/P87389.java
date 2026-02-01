package dev.coma.prgs.Level1;

// Lv.1 나머지가 1이 되는 수 찾기
public class P87389 {
  public int solution(int n) {
    int answer = 1;
    while (answer <= n) {
      if (n % answer == 1) break;
      answer++;
    }

    return answer;
  }
}
