package com.personal.index;

import java.util.ArrayList;
import java.util.List;

public class index {
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
}
