package programers.FiveStack;

public class Bracket5_1 {
    boolean solution(String bracket) {
       int stack = 0;
       for(char c : bracket.toCharArray()){
           if(c == '(') stack++;
           else{
               if(stack == 0) return false;
               stack--;
           }
       }
       return stack == 0;
    }
}

