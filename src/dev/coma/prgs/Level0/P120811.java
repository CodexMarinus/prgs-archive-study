package dev.coma.prgs.Level0;

import java.util.*;

// Lv.0 중앙값 구하기
public class P120811 {
  public int solution(int[] array) {
    Arrays.sort(array);

    return array[array.length / 2];
  }
}
