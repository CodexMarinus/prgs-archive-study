package dev.coma.prgs.Level0;

// Lv.0 코드 처리하기
public class P181932 {
  public String solution(String code) {
    boolean mode = false;
    StringBuilder stringbuilder = new StringBuilder();

    for (int i = 0; i < code.length(); i++) {
      char c = code.charAt(i);

      if (c == '1') mode = !mode;
      else {
        if (mode && i % 2 == 1) stringbuilder.append(c);
        if (!mode && i % 2 == 0) stringbuilder.append(c);
      }
    }

    return (stringbuilder.length() == 0) ? "EMPTY" : stringbuilder.toString();
  }
}
