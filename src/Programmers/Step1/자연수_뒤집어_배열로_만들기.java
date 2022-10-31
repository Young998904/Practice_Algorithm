package Programmers.Step1;

import static java.lang.Math.pow;

import java.util.Scanner;

public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();

        int length = Long.toString(n).length();

        int[] answer = new int[length];

        int index = 0;

        while (n > 0) {
            answer[index] = (int) (n % 10);
            n = n / 10;
            index ++;
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
