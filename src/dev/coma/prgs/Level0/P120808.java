package dev.coma.prgs.Level0;

// Lv.0 분수의 덧셈
public class P120808 {
  public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    numer1 *= denom2;
    numer2 *= denom1;

    int resultNumer = numer1 + numer2;
    int resultDenom = denom1 * denom2;

    int count = 2;
    while (count <= resultDenom) {
      if ((resultNumer % count == 0) && (resultDenom % count == 0)) {
        resultNumer /= count;
        resultDenom /= count;
      } else {
        count++;
      }
    }

    int[] answer = {resultNumer, resultDenom};
    return answer;
  }
}
