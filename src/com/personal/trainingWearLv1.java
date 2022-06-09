package com.sj.study.programers.Random;

public class trainingWearLv1 {

    public static void main(String[] args) {
        int[] num1 = {2, 4};
        int[] num2 = {1, 3, 5};

        System.out.println(solution(5, num1, num2));
    }


    public static int solution(int n, int[] lost, int[] reserve) {

        /*
        *   n	lost	reserve	    return
            5	[2, 4]	[1, 3, 5]	5
            5	[2, 4]	[3]	        4
            3	[3]	    [1]	        2
        *
        * */
        int count = n - lost.length;
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (Math.abs(reserve[i] - lost[j]) >= 2) {
                    continue;
                } else {
                    count++;
                }
            }
        }
        if(count > n) count = n;


        return count;
    }
}
