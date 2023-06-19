class Solution {
    public int[] solution(int n, int m) {
        int a = 0;
        int b = 1000001;
        for(int i = 1 ; i <= Math.min(n,m); i++){
            if(n % i == 0 && m % i == 0){
                a = i;
            }
        }
        
        for(int i = Math.max(n,m) ; i <= n*m ; i++){
            if(i % n == 0 && i % m == 0){
                b = i;
                break;
            }
        }
        return new int[]{a,b};
    }
}