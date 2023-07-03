import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int numberOfPicks = 0;
        int requierdPicks = minerals.length / 5 + 1;
        for(int i : picks){
            numberOfPicks += i;
        }

        int[][] tired = new int[requierdPicks][3];
        for(int i = 0 ; i < Math.min(numberOfPicks*5, minerals.length); i++){
            switch (minerals[i]){
                case "diamond":
                    tired[i / 5][0] += 1;
                    tired[i / 5][1] += 5;
                    tired[i / 5][2] += 25;
                    break;
                case "iron":
                    tired[i / 5][0] += 1;
                    tired[i / 5][1] += 1;
                    tired[i / 5][2] += 5;
                    break;
                case "stone":
                    tired[i / 5][0] += 1;
                    tired[i / 5][1] += 1;
                    tired[i / 5][2] += 1;
                    break;
            }
        }

        Arrays.sort(tired, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[2] < o2[2])
                    return 1;
                else if(o1[2] > o2[2])
                    return -1;
                else
                    return 0;
            }
        });

        for(int i = 0, pick = 0; i < tired.length; i++) {
            while(pick < 3 && picks[pick] == 0) pick++;
            if(pick == 3) break;
            picks[pick]--;
            answer += tired[i][pick];
        }


        return answer;
    }
}