package BaekJoon.BruteForcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek7568 {
    public static void main(String[] args) throws IOException {
        // 숫자 입력 받고 저장
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] xList = new int[N];
        int[] yList = new int[N];
        int[] rank = new int[N];

        for (int i=0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j=0; j < i; j++) {
                if (xList[j] > x && yList[j] > y) {
                    rank[i]++;
                }
                else if (xList[j] < x && yList[j] < y) {
                    rank[j]++;
                }
            }
            xList[i] = x;
            yList[i] = y;
        }

        for (int R : rank) {
            System.out.printf("%d ", R+1);
        }
    }
}

/*
5
55 185 2
58 183 2 // 비교 불가 -> 유지
88 186 1 // 더 큼 -> 상대방 ++
60 175 2 // 더 작은 -> 자기 ++
46 155 5
*/
// 발전 : 2차원 배열로 구현해보기