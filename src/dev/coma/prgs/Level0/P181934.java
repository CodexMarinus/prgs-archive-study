package dev.coma.prgs.Level0;

// Lv.0 조건 문자열
public class P181934 {
  public int solution(String ineq, String eq, int n, int m) {
    switch (ineq + eq) {
      case ">=": return n >= m ? 1 : 0;
      case "<=": return n <= m ? 1 : 0;
      case ">!": return n > m ? 1 : 0;
      case "<!": return n < m ? 1 : 0;
    }

    return -1;
  }
}
