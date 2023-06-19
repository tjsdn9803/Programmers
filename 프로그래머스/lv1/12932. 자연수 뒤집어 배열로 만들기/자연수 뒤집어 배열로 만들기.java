class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for(int i = 0 ; i < s.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(s.length()-1-i)));
        }
        return arr;
    }
}