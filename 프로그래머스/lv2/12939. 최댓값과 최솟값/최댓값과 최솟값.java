class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        String min = arr[0];
        String max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(Integer.parseInt(arr[i]) < Integer.parseInt(min)){
                min = arr[i];
            }
            if(Integer.parseInt(arr[i]) > Integer.parseInt(max)){
                max = arr[i];
            }
        }
        answer = min + " " + max;
        return answer;
    }
}