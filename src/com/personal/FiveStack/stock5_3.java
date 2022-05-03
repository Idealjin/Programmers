package com.sj.study.programers.FiveQueStack;

import java.util.*;

public class stock5_3 {


    public int[] solution(int[] prices) {
        //[1, 2, 3, 2, 3, 3 , 1 , 2 , 2 , 2 ,1]
        //[10, 5, 1, 3, 2, 1, 4, 3, 2, 1, 0]
        //[10, 5, 1, 3, 2, 1, 4, 3, 2, 1, 0]

        //{1, 2, 3, 2, 3}
        //[4, 3, 1, 1, 0]
        int[] answer = new int[prices.length];
        for(int i =0; i < prices.length; i++){
            int count=1;
            for(int j = i+1; j < prices.length; j++){

                int a = prices[i];
                int b = prices[j];
                if(a > b){
                    answer[i] = count;
                    break;
                } else{
                    answer[i] = count;
                    count++;
                }
            }
        }
        return answer;
    }



}
