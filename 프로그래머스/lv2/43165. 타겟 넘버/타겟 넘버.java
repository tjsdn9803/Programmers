class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }
    public void dfs(int[] numbers, int depth, int target, int sum){
        //종료조건
        if(depth == numbers.length){
            //정답 조건
            if(target == sum)
                answer++;
        }
        if(depth < numbers.length){
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }

    }
}