// d(n) -> 각 자리수를 더하는 함수
// d(75) = 75 + 7 + 5
// 33 은 39 의 생성자
// 생성자가 없는 1, 3, 5, 7, .. 75 .. 등을 셀프 넘버라고함
// 10000 보다 작거나 같은 셀프넘버를 한줄씩 출력하도록
// 1 3 5 7 9
// 20 31 42 53 64 75 86 97
// 101 103 105 107 109 120 100 0 1

package BaekJoon.BruteForcing;

import java.util.ArrayList;
import java.util.List;

public class Baek4673 {
  public static void main(String[] args) {

    List<Integer> numList = new ArrayList<>();
    for(int i=1; i <= 10000; i++) {
      numList.add(i);
    }

    for(int i = 1; i < 10000; i++) {
      int a = d(Integer.toString(i));
      if (numList.contains(a)) {
        int index = numList.indexOf(a);
        numList.remove(index);
      }
    }

    for (int num : numList) {
      System.out.println(num);
    }
  }
  public static int d (String number) {
    int result = Integer.parseInt(number);

    for (int i=0; i < number.length(); i++) {
      result += Character.getNumericValue(number.charAt(i));
    }
    return result;
  }
}
