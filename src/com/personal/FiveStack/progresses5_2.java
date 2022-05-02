package com.sj.study.programers.FiveQueStack;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class progresses5_2 {

    public int[] solution(int[] progresess, int[] speeds) {
        List<Integer> answer = new LinkedList<>();
        // [95, 90, 99, 99, 80, 99] , [1, 1, 1, 1, 1, 1]
        // [5,10,1,1,20,1]
        // [1, 3, 2]
        Queue<Integer> que = new LinkedList<>();

        for (int i = 0; i < progresess.length; i++) {
            float p = progresess[i];
            float s = speeds[i];
            int days = (int) Math.ceil((100 - p) / s);
            que.offer(days);
        }

        int first = que.poll();
        int count = 1;
        while (!que.isEmpty()) {
                int d = que.poll();
                if(first >= d){
                    count++;
                    continue;
                }
                answer.add(count);
                count = 1;
                first = d;

        }
        answer.add(count);
        return answer.stream().mapToInt(Integer::intValue).toArray();

    }
}
