package dev.coma.prgs.Level0;

// Lv.0 정수를 나선형으로 배치하기
public class P181832 {
  public int[][] solution(int n) {
    int top = 0;
    int bottom = n - 1;
    int left = 0;
    int right = n - 1;

    int count = 1;
    int[][] resultArr = new int[n][n];
    while (count <= n * n) {
      for (int i = left; i <= right; i++) resultArr[top][i] = count++;
      top++;

      for (int i = top; i <= bottom; i++) resultArr[i][right] = count++;
      right--;

      for (int i = right; i >= left; i--) resultArr[bottom][i] = count++;
      bottom--;

      for (int i = bottom; i >= top; i--) resultArr[i][left] = count++;
      left++;
    }

    return resultArr;
  }
}
