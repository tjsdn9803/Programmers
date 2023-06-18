import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int num = arr[0];
        arrayList.add(num);
        for(int i = 1 ; i < arr.length; i++){
            if(num != arr[i]){
                num = arr[i];
                arrayList.add(num);
            }
        }
        int[] answer = new int[arrayList.size()];
        for(int i = 0 ; i < arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}