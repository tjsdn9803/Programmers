class Solution {
    boolean[] visited;
    int answer;
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        answer = 0;
        dfs(begin, target, words, 0);
        return answer;
    }
    public void dfs(String begin, String target, String[] words, int cnt){
        if(begin.equals(target)){
            answer = cnt;
            return;
        }

        for(int i = 0 ; i < words.length; i++){
            if(visited[i])
                continue;

            if(diffAlphabet(begin, words[i])){
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }
    public boolean diffAlphabet(String s1, String s2){
        int diff = 0;
        for(int i = 0 ; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i))
                diff++;
        }
        if(diff == 1)
            return true;
        else
            return false;
    }
}