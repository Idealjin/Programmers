package com.sj.study.programers.SevenSort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiyString7_2 {
//    ["sun", "bed", "car"]		1	  ["car", "bed", "sun"]
//    ["abce", "abcd", "cdx"]	2	  ["abcd", "abce", "cdx"]
    public String[] solution(String[] sarr, int num){
        String[] ssarr = new String[10];
        List<Character> list = new ArrayList<>();
        for(String s : sarr ){
            list.add(s.charAt(num));
        }
        // 버블 정렬
        char temp = 'a';
        System.out.println(list);
        for (int i =0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                if( list.get(i) > list.get(j)){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);





        return ssarr;

    }
}
