class Solution {
    public long solution(long n) {
        long answer = 0;
        for(int i = 1; i <= Math.sqrt(n)+1 ; i++){
            if(n / i == i && n % i == 0){
                return (long)Math.pow(i+1, 2);
            }
        }
        
        return -1;
    }
}