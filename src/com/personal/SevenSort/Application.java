package com.sj.study.programers.SevenSort;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

//        int[] arr = {4,3,2,1};
        int[] arr = {10};
        delMin7_1 dm = new delMin7_1();
        System.out.println(Arrays.toString(dm.solution(arr)));

    }

}
