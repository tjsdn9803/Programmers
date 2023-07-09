class Solution {
    public int solution(int n, int[] stations, int w) {
        int startPoint = 1;
        int endPoint = 1;
        int answer = 0;
        for(int i = 0; i < stations.length; i++){
            startPoint = stations[i] - w;
            if(startPoint - endPoint >= 1){
                answer += (startPoint - endPoint - 1) / (2*w+1) + 1;
            }
            endPoint = startPoint + (2*w+1);
        }
        if(endPoint <= n){
            answer += (n+1 - endPoint - 1) / (2*w+1) + 1;
        }
        return answer;
    }

}