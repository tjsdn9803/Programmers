import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArr = new char[s.length()];
        for(int i = 0 ; i < s.length(); i++){
            charArr[i] = s.charAt(i);
        }
        Arrays.sort(charArr);
        for(int i = 0 ; i < charArr.length; i++){
            answer += charArr[charArr.length - 1 - i];
        }
        return answer;
    }
}