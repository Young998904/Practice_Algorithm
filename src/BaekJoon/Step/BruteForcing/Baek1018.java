package BaekJoon.Step.BruteForcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1018 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        String [][] chessPan = new String[v][h];

        // 비교하면서 카운트를 하나씩 늘려가면 될듯.
        // 2차원 배열

        for (int i=0; i < v; i++) {
            String[] line = br.readLine().split("");

            for (int j = 0; j< h; j++) {
                chessPan[i][j] = line[j];
            }
        }

        // 비교 시작
        int answer = 64; // max 64 를 넘지 않음
        int count = 0;
        String[] startWithB = {"B", "W", "B", "W", "B", "W", "B", "W"};
        String[] startWithW = {"W", "B", "W", "B", "W", "B", "W", "B"};

        // 총 18개의 경우의 수 확인
        for(int i=0; i <= v-8; i++) {
            for (int j=0; j <= h-8; j++) {
                for (int x = 0; x < 8; x ++) {
                    for (int y = 0; y < 8; y++) {
                        if (x % 2 == 0) {
                            if (!chessPan[i+x][j+y].equals(startWithB[y])) {
                                count++;
                            }
                        }
                        else {
                            if (!chessPan[i+x][j+y].equals(startWithW[y])) {
                                count++;
                            }
                        }
                    }
                }
                if(count < answer) {
                    answer = count;
                }
                count = 0;

                for (int x = 0; x < 8; x ++) {
                    for (int y = 0; y < 8; y++) {
                        if (x % 2 == 0) {
                            if (!chessPan[i+x][j+y].equals(startWithW[y])) {
                                count++;
                            }
                        }
                        else {
                            if (!chessPan[i+x][j+y].equals(startWithB[y])) {
                                count++;
                            }
                        }
                    }
                }

                if(count < answer) {
                    answer = count;
                }
                count = 0;
            }
        }
        System.out.println(answer);
    }
}
/*
10 13
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
WWWWWWWWWWBWB
WWWWWWWWWWBWB
-> 12
1-8 2-9 3-10 -> 0-7 1-8 2-9
1-8 2-9 3-10 4-11 5-12 6-13
=> 총 3 * 6 = 18 가지의 경우의 수 존재
if (0,0) 이 B 이면 BWBWBWBW 순서 체크
else W 이면 WBWBWBWB 순서 체크

BBBBBBBB BWBWBWBW 0
BBBBBBBB WBWBWBWB 1
BBBBBBBB BWBWBWBW 2
BBBBBBBB WBWBWBWB 3
BBBBBBBB BWBWBWBW 4
BBBBBBBB WBWBWBWB 5
BBBBBBBB BWBWBWBW 6
BBBBBBBB WBWBWBWB 7

9 23
BBBBBBBB
BBBBBBBB
BBBBBBBB
BBBBBBBB
BBBBBBBB
BBBBBBBB
BBBBBBBB
BBBBBBBW
-> 반례 발견 : 마지막 칸 W를 체스판 시작이라고 하면 가능 하다.
=> 모든 점이 시작이 가능하는 생각으로 시작해야함..!
*/