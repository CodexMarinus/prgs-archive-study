package dev.coma.prgs.Level0;

import java.util.*;

// Lv.0 배열의 평균값
public class P120817 {
  public double solution(int[] numbers) {
    return (double) Arrays.stream(numbers).sum() / numbers.length;
  }
}
