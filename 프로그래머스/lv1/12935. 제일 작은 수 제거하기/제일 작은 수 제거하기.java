import java.util.*;

class Solution {//1234
    public int[] solution(int[] arr) {
        if(arr.length == 1)
            return new int[]{-1};
        int min = arr[0];
        for(int i : arr){
            min = Math.min(min, i);
        }
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            
            answer[index++] = arr[i];
        }
        return answer;
    }
}