class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if('a' <= c && c <= 'z'){
                if((char)((int)c + n) > 'z'){
                    answer = answer + (char)((int)c + n - 26);
                }else{
                    answer = answer + (char)((int)c + n);
                }
            }else if('A' <= c && c <= 'Z'){
                if((char)((int)c + n) > 'Z'){
                    answer = answer + (char)((int)c + n - 26);
                }else{
                    answer = answer + (char)((int)c + n);
                }
            }else{
                answer = answer + ' ';
            }
        }
        return answer;
    }
}