import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : works){
            queue.add(i);
        }
        for(int i = 0 ; i < n ; i++){
            int num = queue.poll();
            if(num != 0){
                num--;
            }
            queue.add(num);
        }
        while(queue.size() != 0){
            answer += Math.pow(queue.poll(), 2);
        }

        return answer;
    }
}