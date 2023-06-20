class Solution {
    public int solution(String s) {
        int answer = s.length();
        for(int i = 1; i <= s.length() / 2; i++){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            String a = s.substring(0, i);
            for(int j = i; j <= s.length(); j += i){
                String b = s.substring(j, Math.min(j + i, s.length()));
                if(a.equals(b)){
                    count++;
                }else{
                    if(count >= 2) {
                        sb.append(count);
                    }
                    sb.append(a);
                    a = b;
                    count = 1;
                }
            }
            sb.append(a);
            answer = Math.min(sb.length(), answer);
        }

        return answer;
    }
}