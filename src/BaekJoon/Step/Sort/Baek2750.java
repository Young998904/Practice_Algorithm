package BaekJoon.Step.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열 크기 입력
        int N = Integer.parseInt(br.readLine());

        int [] numList = new int[N];
        int cnt = 1;

        numList[0] = Integer.parseInt(br.readLine());

        for (int i=1; i<N; i++) {
            int num = Integer.parseInt(br.readLine());

            for (int j=0; j<cnt; j++) {
                if (numList[j] < num) {
                    if (j == cnt -1) {
                        numList[j+1] = num;

                    }
                }
                else {
                    for (int k=cnt-1; k >= j; k--) {
                        numList[k+1] = numList[k];
                    }
                    numList[j] = num;
                    break;
                }
            }
            cnt++;
        }

        for (int i=0; i<N; i++) {
            System.out.println(numList[i]);
        }
    }
}

/*
1. 숫자 입력 받기
2. 첫번째 숫자는 무조건 1번
3. 두번째 숫자부터 비교하며 위치 찾기
-----------
앞에서 부터 탐색
경우 1_if :  특정 위치의 배열의 값보다 입력값이 클 때
(1) 현재 크기와 같은가? -> 바로 뒤에 값 넣음
(2) 아니다 -> 좀더 탐색 (continue)
경우 2_else : 특정 위치의 배열의 값보다 입력값이 작을 때
해당 위치에 입력값을 넣고, 나머지는 하나씩 뒤로
=끝=
------------
4. 하나씩 출력
*/