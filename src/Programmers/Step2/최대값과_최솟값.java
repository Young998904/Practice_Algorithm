package Programmers.Step2;

import java.util.Arrays;
import java.util.stream.Stream;

public class 최대값과_최솟값 {
    public static void main(String[] args) {
        String s = "4 2 -1 3";
        String[] strList = s.split(" ");

        int[] numList = Arrays.stream(strList)
            .mapToInt(Integer::parseInt)
            .toArray();

        Arrays.sort(numList);

        System.out.println(numList[0]);
        System.out.println(numList[numList.length-1]);
    }
}
