package dev.coma.prgs.Level0;

import java.util.*;

// Lv.0 최빈값 구하기
public class P120812 {
  public int solution(int[] array) {
    int[][] countArr = new int[1000][2];
    for (int i = 0; i < 1000; i++) {
      countArr[i] = new int[]{i, 0};
    }

    for (int num : array) countArr[num][1]++;
    Arrays.sort(countArr, (o1, o2) -> Integer.compare(o1[1], o2[1]));

    return countArr[999][1] == countArr[998][1] ? -1 : countArr[999][0];
  }
}
