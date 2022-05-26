package com.sj.study.programers.SevenSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hIndex7_4 {
    /*
    * citations	    	    return
      [3, 0, 6, 1, 5]	    3
    * */
    /*     h    m(index)
    * 0일때 5    0
    * 1일때 4    1
    * 3일때 3    2
    * 5일때 2    3
    * 6일때 1    4
    *
    * */
    public int solution(int[] citations){
        Arrays.sort(citations);
        int h = 0;
        for (int i = 0; i < citations.length; i++) {
            h = citations.length -i;
            if (h <= citations[i]){
                 return h;
            }
        }
        return 0;
    }
}
