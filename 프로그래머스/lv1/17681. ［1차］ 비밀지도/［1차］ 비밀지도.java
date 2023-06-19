import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] intArr = new int[n];
        for(int i = 0 ; i < n ; i++){
            int num1 = arr1[i];
            int num2 = arr2[i];
            
            intArr[i] = num1 | num2;
        }
        
        for(int i = 0 ; i < n ; i++){
            String s = Integer.toString(intArr[i], 2);
            while(s.length() != n){
                s = "0" + s;
            }
            s = s.replace('1', '#');
            s = s.replace('0', ' ');
            answer[i] = s;
        }
        return answer;
    }
}