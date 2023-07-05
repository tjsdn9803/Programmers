import java.util.*;

class Solution {
    public int[] solution(String[] operation) {
        int[] answer = new int[2];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        PriorityQueue<Integer> maxqueue = new PriorityQueue<>(Collections.reverseOrder());
        for(String s : operation){
            String[] strings = s.split(" ");
            switch (strings[0]){
                case "I":
                    queue.add(Integer.valueOf(strings[1]));
                    maxqueue.add(Integer.valueOf(strings[1]));
                    break;
                case "D":
                    if(queue.size() == 0)
                        break;
                    if(strings[1].equals("1")){
                        int num = maxqueue.poll();
                        queue.remove(num);
                    }else{
                        int num = queue.poll();
                        maxqueue.remove(num);
                    }
                    break;
            }
        }
        if(queue.size() == 0 && maxqueue.size() == 0){
            return answer;
        }
        answer[0] = maxqueue.peek();
        answer[1] = queue.peek();
        return answer;
    }
}