package com.sj.study.programers.FourSet;

import java.util.*;

public class Lotto4_1 {
    public boolean solution(int[] lotto){
        //배열을 셋에 넣어서 중복되지 않게한다.
        Set<Integer> lottoCheck = new HashSet<>();
        for(int lo : lotto){
            lottoCheck.add(lo);
        }
        System.out.println(lottoCheck);

        //길이가 6이면 true/아니면 false를 반환한다.
        return lottoCheck.size() == 6? true : false;
    }
}
