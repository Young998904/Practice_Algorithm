package Programmers.Algorithm.Greedy;

public class 기지국_설치 {
    public static void main(String[] args)  {
        // 초기값 세팅
        int N = 11;
        int[] stations = {4, 11};
        int W = 1;

        // 풀이 시작
//        // 방법 (1)
//        int answer = 0;
//
//        Queue<Integer> sq = new LinkedList<>();
//        for (int s : stations) sq.offer(s); // Queue 에 값 추가 => [4, 11]
//
//        int position = 1;
//
//        while (position <= N) {
//            if (!sq.isEmpty() && position >= sq.peek()-W) { // 현재 위치가 기지국의 범파 전파 범위 안에 있는 경우
//                position = sq.poll() + W + 1; // poll : 맨 앞의 값 반환 후 삭제
//            } else {
//                answer++; // 현재 위치 기준 전파범위 최대 거리에 기지국 세움
//                position += 2*W + 1; // 이동
//            }
//        }
//
//        // 방법 (2) : Loop 줄이기 -> 더이상 줄일 게 없음 pass

        // 방법 (3) : primitive vs object -> primitive type 을 사용하는 것이 더 효율적임 => Queue 사용 x
        long beforeTime = System.currentTimeMillis();
        int answer = 0;
        int si = 0; // station 배열의 index
        int position = 1;

        while (position <= N) {
            if (si < stations.length && position >= stations[si]-W) { // 주어진 배열과 primitive type 인 si 를 사용
                position = stations[si] + W + 1;
                si++;
            } else {
                answer++;
                position += 2*W + 1;
            }
        }
        System.out.println(answer);
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);

        System.out.println("방법 (3) 시간차이(ms) : "+secDiffTime);
    }
}