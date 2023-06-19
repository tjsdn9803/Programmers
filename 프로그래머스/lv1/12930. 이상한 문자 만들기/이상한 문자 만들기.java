class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        
        int index = 0;
        
        for(int i = 0 ; i < sArr.length; i++){
            if(sArr[i].equals(" ")){
                index = 0;
                answer += " ";
                continue;
            }
            if(index % 2 == 0){
                answer += sArr[i].toUpperCase();
                index++;
            }else {
                answer += sArr[i].toLowerCase();
                index++;
            }
        }
        
        return answer;
    }
}