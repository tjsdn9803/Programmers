import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n,3);
        for(int i = 0 ; i < s.length(); i++){
            answer = answer + ((int)s.charAt(i) - 48) * (int)Math.pow(3, i);
        }
        return answer;
    }
}