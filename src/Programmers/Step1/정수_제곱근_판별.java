package Programmers.Step1;

import static java.lang.Math.*;

import java.util.Scanner;

public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        double a = floor(sqrt(n));
        double b = ceil(sqrt(n));

        long answer =  a == b ? (long) pow(a+1, 2) : -1;

        System.out.println(answer);
    }
}
