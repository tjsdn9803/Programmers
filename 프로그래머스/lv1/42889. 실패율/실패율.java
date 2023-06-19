import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 1 ; i <= N ; i++) {
            double totalPerson = 0;
            double failPerson = 0;
            for (int j = 0; j < stages.length; j++) {
                if(i <= stages[j]) totalPerson++;
                if(i == stages[j]) failPerson++;
            }
            if(totalPerson == 0 && failPerson == 0) totalPerson = 1;
            map.put(i, failPerson/totalPerson);
        }
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            double max = -1;
            int rKey = 0;
            for (int key : map.keySet()){
                if(max < map.get(key)){
                    max = map.get(key);
                    rKey = key;
                }
            }
            answer[i] = rKey;
            map.remove(rKey);
        }

        return answer;
    }
}