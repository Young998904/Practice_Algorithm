package BaekJoon.Step.Recursion;

import java.util.Scanner;

public class Baek10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 1;

        for (int i=2; i <= N; i++) {
            answer *= i;
        }

        System.out.println(answer);
    }
}