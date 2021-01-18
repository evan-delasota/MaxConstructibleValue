import java.util.Collections;
import java.util.List;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    List<Integer> arr = Arrays.asList(12, 2,1,15, 2, 4);

    System.out.println(maxValue(arr));
  }

  static int maxValue(List<Integer> arr) {
    Collections.sort(arr);
    int maxConstructibleValue = 0;

    for (Integer n : arr) {
      if (n > maxConstructibleValue + 1) {
        break;
      }
      maxConstructibleValue += n;
    }
    return maxConstructibleValue + 1;
  }
}