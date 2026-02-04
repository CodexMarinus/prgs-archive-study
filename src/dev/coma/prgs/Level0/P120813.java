package dev.coma.prgs.Level0;

import java.util.*;

// Lv.0 짝수는 싫어요
public class P120813 {
  public int[] solution(int n) {
    StringBuilder stringbuilder = new StringBuilder();
    for (int i = 1; i <= n; i += 2) {
      stringbuilder.append(i + " ");
    }

    return Arrays.stream(stringbuilder.toString().split(" "))
            .map(Integer::parseInt)
            .mapToInt(Integer::intValue)
            .toArray()
            ;
  }

}
