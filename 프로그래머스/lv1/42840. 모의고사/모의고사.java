import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int firstCorr = 0;
        int secondCorr = 0;
        int thirdCorr = 0;
        for(int i = 0 ; i < answers.length; i++){
            if(first[i % first.length] == answers[i])
                firstCorr++;
            if(second[i % second.length] == answers[i])
                secondCorr++;
            if(third[i % third.length] == answers[i])
                thirdCorr++;
        }
        
        int max = Math.max(firstCorr, secondCorr);
        max = Math.max(max, thirdCorr);
        
        ArrayList<Integer> alist = new ArrayList<>();
        if(max == firstCorr){
            alist.add(1);
        }
        if(max == secondCorr){
            alist.add(2);
        }
        if(max == thirdCorr){
            alist.add(3);
        }
        int[] answer = new int[alist.size()];
        for(int i = 0 ; i < alist.size(); i++){
            answer[i] = alist.get(i);
        }
        return answer;
    }
}