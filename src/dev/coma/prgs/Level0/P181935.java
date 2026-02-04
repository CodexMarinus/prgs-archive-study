package dev.coma.prgs.Level0;

import java.util.stream.*;

// Lv.0 홀짝에 따라 다른 값 반환하기
public class P181935 {
  public int solution(int n) {
    return (n % 2 == 0) ?
            IntStream.rangeClosed(1, n).filter(num -> num % 2 == 0).map(num -> num * num).sum()
            : IntStream.rangeClosed(1, n).filter(num -> num % 2 == 1).sum();
  }
}
