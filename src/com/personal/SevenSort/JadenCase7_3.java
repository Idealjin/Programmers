package com.sj.study.programers.SevenSort;

public class JadenCase7_3 {
//        "3people unFollowed me"	"3people Unfollowed Me"
//        "for the last week"		"For The Last Week"
    public String soulution(String s){
        String[] str = s.toLowerCase().split(" ");
        StringBuilder str2 = new StringBuilder();
        for(String st : str){
            str2.append(st.substring(0,1).toUpperCase() + st.substring(1) + " ");
        }
        String answer = str2.toString().substring(0,str2.length()-1);
        System.out.println(answer);
        return answer;
    }
}
