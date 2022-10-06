package BaekJoon.Step.Recursion;

import java.util.Scanner;

public class Baek10870 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 0 이나 1 일 때
        if (N == 0 || N == 1) {
            System.out.println(N);
            return;
        }

        int one = 0;
        int two = 1;
        int newOne;

        for (int i=2; i<=N; i++) {
            newOne = two;
            two = fibo(one, two);
            one = newOne;
        }
        System.out.println(two);
    }
    public static int fibo(int one, int two) {
        return one + two;
    }
}