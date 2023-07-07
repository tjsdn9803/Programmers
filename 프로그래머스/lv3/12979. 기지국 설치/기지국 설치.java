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

// function solution(n, stations, w) {
//     let beforeStation = 0;
//     let count=0;
//     let distance = 0;
//     let allWidth = 2*w+1;
//     let answer = 0 ;
//    for(let i=0;i<=stations.length;i++)
//        {
//            if(i===stations.length && stations[i-1] + w < n){
//                         answer += Math.ceil((n-stations[i-1] -w ) / allWidth);
//            }
//            else if(i !==stations.length){
//            distance = stations[i] - beforeStation -1 -w;

//            answer += Math.ceil(distance / allWidth); 
//            beforeStation = stations[i]+ w ;
//            }
//        }

// return answer
// }