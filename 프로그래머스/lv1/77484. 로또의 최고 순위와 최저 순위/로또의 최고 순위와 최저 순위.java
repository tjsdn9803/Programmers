import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int corr = 0;
        int zeros = 0;
        ArrayList<Integer> alist = new ArrayList<>();
        for(int i : lottos){
            if(i == 0){
                zeros++;
            }
            alist.add(i);
        }
        for(int i = 0 ; i < win_nums.length; i++){
            if(alist.contains(win_nums[i])){
                corr++;
            }
        }
        System.out.println(corr);
        System.out.println(zeros);
        int max = corr + zeros;
        int min = corr;
        if(max == 0){
            max = 6;
        }else{
            max = 7- max;
        }
        if(min == 0){
            min = 6;
        }else{
            min = 7- min;
        }
        return new int[]{max, min};
    }
}