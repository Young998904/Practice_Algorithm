package Programmers.Algorithm.StackAndQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class 다리를_지나는_트럭 {
    public static void main(String[] args) {
        // 입력값
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        // 풀이
        int time = 0; // 현재 시간
        int tw = 0; // 다리 위의 총 무게
        int index = 0; // 지나가야하는 다음 index

        Queue<Integer> bridge = new ArrayDeque<>();
        Queue<Integer> stop = new LinkedList<>();

        while (index < truck_weights.length) {// 다 넣을 때 까지
            if (!stop.isEmpty() && time == stop.peek()) {
                // 무게 빼고 & 큐에서 빼고 동시
                tw -= bridge.poll();
                stop.remove();
            }
            // (1) 더 넣을 수 있는 상태면
            // 넣고, 무게추가, 종료시간 추가
            if (bridge.size() < bridge_length && tw + truck_weights[index] <=  weight) {
                tw += truck_weights[index];
                bridge.add(truck_weights[index]);
                stop.add(time + bridge_length);
                time++;
                index++;
                continue;
            }
            // (2) 더 넣을 수 없는 상태면 그대로 시간추가 +1
            time ++;
        }

        while (!stop.isEmpty()) {
            time = stop.poll();
        }
        System.out.println(time + 1);
    }

}
