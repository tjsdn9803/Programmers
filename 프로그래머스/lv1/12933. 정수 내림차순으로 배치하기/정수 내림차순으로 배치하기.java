import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        String[] sArr = s.split("");
        
        Arrays.sort(sArr);

        String StringAnswer = "";
        int i = 0;
        for(String s11 : sArr){
           answer += Integer.parseInt(s11) * Math.pow(10, i);
            i++;
        }
        
        
        return answer;
    }
}