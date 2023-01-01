package Programmers.Algorithm.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

class job {
    int index;
    int priority;

    public job (int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}
public class 프린터 {
    public static Queue<job> q = new LinkedList<job>();

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 0;

        int answer = 0;

        for (int i=0; i<priorities.length; i++) {
            q.add(new job(i, priorities[i]));
        }

        job j = new job(-1, -1);
        int prior = 0;

        while (j.index != location) {
            answer++;
            // 우선 순위 max 값 확인
            for (int i=0; i<priorities.length; i++) {
                prior = Math.max(prior, priorities[i]);
            }
            for (int i=0; i<priorities.length; i++) {
                if (priorities[i] == prior) {
                    priorities[i] = 0;
                    break;
                }
            }
            j = printer(prior);
            prior = 0;
        }

        System.out.println(answer);
    }
    public static job printer(int max) {
        job j;
        while (true) {
            j = q.remove();
            if (j.priority == max) {
                return j;
            }
            q.add(j);
        }
    }
}
