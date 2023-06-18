class Solution {
    public int is_prime(int number){
        for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return 0;
			}
		}
		return 1;
    }
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    answer = answer + is_prime(sum);
                }
            }
        }
        return answer;
    }
}