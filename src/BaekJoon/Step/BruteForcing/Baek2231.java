package BaekJoon.Step.BruteForcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2231 {
    public static void main(String[] args) throws IOException {
        // 방법 1 문자열 처리
//        // 숫자 N 입력 받기
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//
//        for (int i=1; i < N; i++) {
//            int total = i;
//            String num = String.valueOf(i);
//
//            for (int j=0; j < num.length(); j++) {
//                total += Character.getNumericValue(num.charAt(j));
//            }
//
//            if (N == total) {
//                System.out.println(i);
//                return;
//            }
//        }
//
//        System.out.println(0);
        // 방법 2 숫자 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for (int i = 1; i < N; i++) {
            int total = i;
            int num = i;
            while(num > 0) {
                total += num % 10;
                num = num / 10;
            }

            if (N == total) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);

    }
}

// N : 245
// 분해합 : 245 + 4 + 5 = 254
// M : 254
// N 은 M 의  생성자

// 숫자 N 이 주어졌을 때 가장 작은 생성자
// 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
