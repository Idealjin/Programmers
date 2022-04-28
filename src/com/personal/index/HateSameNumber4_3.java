package com.sj.study.programers.FourSet;

import java.util.*;

public class HateSameNumber4_3 {
    public Integer[] solution(int[] same){
//        {1,1,1,/3,3,3/,0,/1,1}
        List<Integer> answer = new ArrayList<>();
        //앞에 숫자를 비교해서 같지 않으면 리스트에 추가
        for(int i =0; i < same.length; i++){
            if(!answer.contains(same[i])){
                answer.add(same[i]);
            }
            if(answer.get(answer.size()-1) != same[i]){
                answer.add(same[i]);

            }
        }
        //리스트를 배열로 반환
        Integer[] answer1 = answer.toArray(Integer[]::new);


        return answer1;
    }
}
