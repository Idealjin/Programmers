package com.sj.study.programers.SixBS;

import java.util.Arrays;

//["119", "97674223", "1195524421"]	    false
//["123","456","789"]			        true
//["12","123","1235","567","88"]		false
public class Phone6_1 {
    public boolean solution(String[] phone_book){
        Arrays.sort(phone_book);
        for(int i = 1; i<phone_book.length; i++){
            if(phone_book[i].startsWith(phone_book[i-1])) return false;
        }
        return true;
    }
}
