class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2 ; i <= n ; i++){
            if(find(i))
                answer++;
        }
        return answer;
    }
    public boolean find(int n){
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
           if(n % i == 0){
               return false;
           } 
        }
        return true;
    }
}