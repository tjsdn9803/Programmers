class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            if(calculate(i) % 2 == 0)
                answer += i;
            else if(calculate(i) % 2 == 1){
                answer -= i;
            }
        }
        return answer;
    }
    public int calculate(int num){
        int sum = 0;
        for(int i = 1 ; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                if(num / i == i){
                    sum++;
                }else{
                    sum = sum + 2;    
                }
                
            }
        }
        return sum;
    }
}