package dev.coma.prgs.Level0;

// Lv.0 문자열 섞기
public class P181942 {
  public String solution(String str1, String str2) {
    StringBuilder stringbuilder = new StringBuilder();

    for (int i = 0; i < str1.length(); i++) {
      stringbuilder.append("" + str1.charAt(i) + str2.charAt(i));
    }

    return stringbuilder.toString();
  }
}
