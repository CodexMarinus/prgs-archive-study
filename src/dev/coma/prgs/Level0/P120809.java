package dev.coma.prgs.Level0;

// Lv.0 배열 두 배 만들기
public class P120809 {
  public int[] solution(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = numbers[i] * 2;
    }

    return numbers;
  }
}
