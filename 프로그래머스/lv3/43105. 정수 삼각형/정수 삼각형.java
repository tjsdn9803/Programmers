import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];

        for(int i = 1 ; i < triangle.length; i++){
            for(int j = 0 ; j < triangle[i].length; j++){
                if(j == 0){
                    dp[i][j] = dp[i-1][j] + triangle[i][j];
                } else {
                    dp[i][j] = triangle[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
                }
            }
        }
        int answer = Arrays.stream(dp[triangle.length - 1]).max().getAsInt();

        return answer;
    }
}