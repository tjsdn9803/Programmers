class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        if(s / n < 1)
            return new int[]{-1};
        int cnt = n;
        for(int i = 0 ; i < cnt ; i++){
            int num = s/n;
            answer[i] = num;
            n--;
            s -= num;
        }
        return answer;
    }
}