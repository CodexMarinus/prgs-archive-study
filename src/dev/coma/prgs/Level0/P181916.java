package dev.coma.prgs.Level0;

import java.util.*;

// Lv.0 주사위 게임 3
public class P181916 {
  public int solution(int a, int b, int c, int d) {
    List<Integer> list = new ArrayList<>(List.of(a, b, c, d));
    Collections.sort(list);
    a = list.get(0);
    b = list.get(1);
    c = list.get(2);
    d = list.get(3);

    int size = new HashSet(list).size();
    if (size == 1) return 1111 * a;
    if (size == 4) return a;

    if (size == 2) {
      if (a == b && c == d) return (c + a) * (c - a);

      if (a == b && b == c) return (int) Math.pow((10 * a + d), 2);
      if (b == c && c == d) return (int) Math.pow((10 * d + a), 2);
    }

    if (size == 3) {
      if (a == b) return c * d;
      if (b == c) return a * d;
      if (c == d) return a * b;
    }

    return -1;
  }
}
