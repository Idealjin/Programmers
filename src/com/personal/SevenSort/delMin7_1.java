package com.sj.study.programers.SevenSort;

import java.util.ArrayList;
import java.util.List;

public class delMin7_1 {

    public int[] solution(int[] arr){
        int[] answer = {arr.length};
//        [4,3,2,1]		[4,3,2]
//        [10]		[-1]
        if (arr.length == 1){
            answer[0] = -1;
            return answer;
        }

        int min = arr[0];
        List<Integer> list = new ArrayList<>();
        for (int j : arr) {
            list.add(j);
            if (j < min) {
                min = j;
            }
        }

        list.remove((Integer) min);

        return  list.stream().mapToInt(Integer::intValue).toArray();
    }

}
