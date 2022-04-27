package com.sj.study.programers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class marathon3_2 {
    public String solution(String[] participant, String[] completion) {
      String answer = "";
      Map<String, Integer> fin = new HashMap<>();
      for(String player : participant){
          fin.put(player, fin.getOrDefault(player, 0) +1);
          System.out.println(fin);
      }
      for(String player : completion) {
          fin.put(player, fin.get(player) -1);
          System.out.println(fin);
      }

      Iterator<Map.Entry<String, Integer>> iter = fin.entrySet().iterator();
      while(iter.hasNext()){
          Map.Entry<String, Integer> entry = iter.next();
          if( entry.getValue() != 0){
              answer = entry.getKey();
          }
      }

      return answer;
    }
}
