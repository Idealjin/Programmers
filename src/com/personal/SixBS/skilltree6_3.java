package com.sj.study.programers.SixBS;

import java.util.LinkedList;
import java.util.Queue;

public class skilltree6_3 {
    //"CBD"	["BACDE", "CBADF", "AECB", "BDA", "AEF"]	2
    public int solution(String skill, String[] skill_trees){
       int count = 0;
       for(String p : skill_trees){
           String s2 = p.replaceAll("[^"+skill+"]","");
           System.out.println(s2);
           if(s2.equals("")){
               continue;
           }
           for (int i = 0; i < s2.length(); i++) {
               if (s2.charAt(i) != skill.charAt(i)){
                   count += 1;
                   break;
               }
           }
       }
       return skill_trees.length - count;
    }


}
