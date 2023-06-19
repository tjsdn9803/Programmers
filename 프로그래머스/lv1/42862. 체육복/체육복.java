import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = n - lost.length;
        //여벌 체육복 가져온 학생이 도난당하는 경우
        for(int i = 0 ; i < lost.length; i++){
            for(int j = 0 ; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                }
            }
        }
        
        
        for(int i = 0 ; i < lost.length; i++){//체육복 빌려주는 과정
            if(lost[i] == -1)
                continue;
            for(int j = 0 ; j < reserve.length; j++){
                if(lost[i] - reserve[j] <= 1 && lost[i] - reserve[j] >= -1){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}