package dev.coma.prgs.Level1;

// Lv.1 평균 구하기
public class P12944 {
  public double solution(int[] arr) {
    double sum = 0;
    for (int num : arr) {
      sum += num;
    }

    return sum / arr.length;
  }
}
