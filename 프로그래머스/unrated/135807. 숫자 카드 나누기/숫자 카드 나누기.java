import java.util.*;

class Solution {
    List<Integer> divisor;
    public void findDivisor(int num){
        divisor = new ArrayList<>();
        
        for(int i = 1 ; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                divisor.add(i);
                divisor.add(num / i);
            }
        }
    }
    
    public int findNumber(int[] a, int[] b){
        int answer = 0;
        Arrays.sort(a);
        findDivisor(a[0]);
        Collections.sort(divisor, Collections.reverseOrder());
        
        for(int i : divisor){
            if(allDivided(a, i)){
                if(allNotDivided(b, i)){
                    return i;
                }
            }
        }
        return answer;    
    }
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        answer = Math.max(findNumber(arrayA, arrayB), findNumber(arrayB, arrayA));
        
        return answer;
    }
    public boolean allDivided(int[] arr, int i){
        for(int number : arr){
            if(number % i != 0)
                return false;
        }
        return true;
    }
    
    public boolean allNotDivided(int[] arr, int i){
        for(int number : arr){
            if(number % i == 0)
                return false;
        }
        return true;
    }
    
    
    
    
}