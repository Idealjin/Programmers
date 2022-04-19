package com.personal.index;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class index {
    //Index 찾기
    public List<Integer> solution(int[] arr){
        List<Integer> index = new ArrayList<>();
        int max = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i =0; i < arr.length; i++){
            if(max == arr[i]){
                index.add(i);
            }
        }
        System.out.println(max);
        System.out.println(index);

        return index;
    }
    //순열검사
    static class Solution2 {
        public boolean solution(int[] arr) {
            boolean answer = true;
            Arrays.sort(arr);

            for(int i = 0; i < arr.length; i++){
                if(arr[i] != i+1 ){
                    answer = false;
                    break;
                }
            }
            return answer;
        }
    }

}
