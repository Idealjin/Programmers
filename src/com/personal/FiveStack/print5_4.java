package com.sj.study.programers.FiveQueStack;

import java.util.*;

public class print5_4 {
    class myData {
        int priority;
        boolean data;
        myData(int p, boolean Yn){ priority = p; data = Yn;}
    }

    public int solution(int[] priorities, int location){
        int answer = 0;
        int max = 0;
        //[2, 1, 3, 2] , 2
        // CDAB , 1
        List<myData> list = new LinkedList<>();
        List<myData> list2 = new LinkedList<>();
        for(int i =0; i<priorities.length; i++){
            list.add(new myData(priorities[i], i == location));
            if(max < priorities[i]) max = priorities[i];
        }

        // 1,1,9,2,8,1
        // 1,9,2,8,1,1
        // 9,2,8,1,1,1
        // 9/ 2,8,1,1,1
        // 9/ 8,1,1,1,2
        // 9,8/ 1,1,1,2
        //9,8/ 1,1,2,1

        while(!list.isEmpty()){
            myData a = list.remove(0);

            boolean printable = true;
            for(myData p : list){
                 if( a.priority < p.priority ) {
                    printable = false;
                    }
            }
            if(!printable) {
                list.add(a);
            } else{
                list2.add(a);
            }

         }


       for(myData i : list2){
           if(i.data) answer = list2.indexOf(i) + 1;
           System.out.print(i.priority);
       }
       System.out.println();
        System.out.println(answer);
        return answer;
    }
}
