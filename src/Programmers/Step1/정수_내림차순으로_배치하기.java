package Programmers.Step1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        String answer = "";
        long n = new Scanner(System.in).nextLong();

        String[] list = Long.toString(n).split("");

        Arrays.sort(list, Collections.reverseOrder());

        for (String str : list) {
            answer += str;
        }

        long a = Long.parseLong(answer);

        System.out.println(a);
    }
}
