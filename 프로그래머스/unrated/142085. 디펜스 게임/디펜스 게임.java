import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        int sum = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int i;
        for(i = 0 ; i < enemy.length; i++){
            if(sum + enemy[i] > n){
                if(k != 0){
                    queue.add(enemy[i]);
                    sum -= queue.poll();
                    sum += enemy[i];
                    k--;
                }else{
                    answer = i;
                    break;
                }
            }else{
                queue.add(enemy[i]);
                sum += enemy[i];
            }
        }
        if(i == enemy.length){
            return enemy.length;
        }else{
            return answer;    
        }
        
    }
}