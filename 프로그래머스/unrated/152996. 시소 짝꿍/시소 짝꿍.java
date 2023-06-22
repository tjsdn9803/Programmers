import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        
        double[] ratios = {1.0, 3.0 / 2.0, 2.0, 2.0 / 3.0, 4.0 / 3.0, 1.0 / 2.0, 3.0 / 4.0};
        
        Map<Double, Double> map = new HashMap<>();
        
        for(double weight : weights){
            if(!map.containsKey(weight)){
                map.put(weight, 1.0);
            }else{
                map.put(weight, map.get(weight) + 1);
            }
        }
        
        for(double weight:weights) {
            map.put(weight, map.get(weight)-1);

            for(double gob : ratios) {
                double target = weight*gob; 
                if(target>=100.0&&target<=1000.0) {
                    double cnt = map.getOrDefault(target, 0.0);
                    answer+=cnt;

                }
            }
        }
        
        return answer;
    }
}