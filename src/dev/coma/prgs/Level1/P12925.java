package dev.coma.prgs.Level1;

// Lv.1 문자열을 정수로 바꾸기
public class P12925 {
  public int solution(String s) {
    int answer = 0;
    boolean isMinus = false;

    if (s.charAt(0) == '-') {
      isMinus = true;
      s = s.substring(1);
    }

    if (isMinus) answer -= Integer.parseInt(s);
    else answer += Integer.parseInt(s);

    return answer;
  }
}
