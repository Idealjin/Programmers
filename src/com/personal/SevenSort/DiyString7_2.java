package programers.SevenSort;

import java.util.Arrays;

public class DiyString7_2 {
    //    ["sun", "bed", "car"]		1	  ["car", "bed", "sun"]
//    ["abce", "abcd", "cdx"]	2	  ["abcd", "abce", "cdx"]
    public String[] solution(String[] sarr, int num) {
        Arrays.sort(sarr, (s1, s2) -> {
            if(s1.charAt(num) == s2.charAt(num)) return s1.compareTo(s2);
            return s1.charAt(num) - s2.charAt(num);
        });

        return sarr;
    }
}

/* 기존 제출한것
*   String[] answer = new String[sarr.length];
        List<String> list = new ArrayList<>();

        for (int i = 0; i < sarr.length; i++) {
            list.add("" + sarr[i].charAt(num) + sarr[i]);
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }

        return answer;
* */
