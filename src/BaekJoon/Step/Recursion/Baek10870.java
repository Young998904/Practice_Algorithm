package BaekJoon.Step.Recursion;

import java.util.Scanner;

// 방법 1
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

//// 방법 2
//public class Baek10870 {
//    public int fibo(int one, int two) {
//        return one + two;
//    }
//    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        Baek10870 baek10870 = new Baek10870();
//
//        // 0 이나 1 일 때
//        if (N == 0 || N == 1) {
//            System.out.println(N);
//            return;
//        }
//
//        int one = 0;
//        int two = 1;
//        int newOne;
//
//        for (int i=2; i<=N; i++) {
//            newOne = two;
//            two = baek10870.fibo(one, two);
//            one = newOne;
//        }
//        System.out.println(two);
//    }
//}