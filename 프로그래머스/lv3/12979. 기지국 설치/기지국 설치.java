class Solution {
    public int solution(int n, int[] stations, int w) {
        int startPoint = 1;
        int endPoint = 1;
        int answer = 0;
        // station배열의 기지국의 전파가 도달하는 가장 왼쪽칸(startPoint)과 전파가 닿지 않는 구역의 가장 왼쪽 칸(endPoint)의            차이를 구하여 기지국 배정
        // 그다음 station의 도달하는 전파가 endPoint위치보다 왼쪽에 있을 수 있으므로 차이를 구하여 1이상일때만 로직 발동
        
        // ex) 예시 1의 경우 startPoint는 3 endPoint는 1, 차이가 2이기 때문에 기지국 한개 추가 
        //     다음 기지국의 startPoint는 10 endPoint는 6, 차이가 4이기 떄문에 기지국 두개 추가
        for(int i = 0; i < stations.length; i++){
            startPoint = stations[i] - w;
            if(startPoint - endPoint >= 1){
                answer += (startPoint - endPoint - 1) / (2*w+1) + 1;
            }
            endPoint = startPoint + (2*w+1);
        }
        
        //     반복문이 종료되고 난 뒤 남아있는 전파가 닿지 않는 곳이 있는지 확인 후 있다면 기지국 추가
        if(endPoint <= n){
            answer += (n+1 - endPoint - 1) / (2*w+1) + 1;
        }
        return answer;
    }

}