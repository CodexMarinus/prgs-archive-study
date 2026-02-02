package dev.coma.prgs.Level0;

// Lv.0 문자열 겹쳐쓰기
public class P181943 {
  public String solution(String my_string, String overwrite_string, int s) {
    String answer = my_string.substring(0, s)
            + overwrite_string
            + my_string.substring(s + overwrite_string.length())
            ;

    return answer;
  }
}
