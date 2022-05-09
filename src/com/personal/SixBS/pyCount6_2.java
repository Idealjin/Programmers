package com.sj.study.programers.SixBS;

public class pyCount6_2 {
//        "pPoooyY"	true
//        "Pyy"		false
    public boolean solution(String s){
        String str = s.toLowerCase();
        int pcount = 0;
        int ycount = 0;
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == 'p'){
                pcount++;
            }
            if(str.charAt(i) == 'y'){
                ycount++;
            }
        }
        if(pcount != ycount){
            return false;
        }
        return true;
    }

}
