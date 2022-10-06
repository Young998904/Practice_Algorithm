package BaekJoon.Step.BruteForcing;

import java.util.Scanner;

public class Baek1065 {
    public static void main(String[] args) {
        int [] numList = new int[1001];

        // 초기화
        for (int i = 1; i < 100; i++) {
            numList[i] = 1;
        }
        numList[1000] = 0;

        for (int i = 100; i < 1000; i++) {
            String num = String.valueOf(i);

            int a = num.charAt(0);
            int b = num.charAt(1);
            int c = num.charAt(2);

            numList[i] = (a-b == b-c) ? 1 : 0;
        }
        //

        // 숫자 입력 받음
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        //

        // 한수 개수 확인
        int count = 0;
        for(int i = 1; i <= d; i++) {
            if (numList[i] == 1) {
                count++;
            }
        }
        //

        System.out.println(count);
    }
}
// 1 - 9 -> 9 개
// 10 - 99 -> 90 개
// 100 - 199
// 200 - 299
// 300 - 399
// 400 - 499
