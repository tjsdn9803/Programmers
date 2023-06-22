import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[col-1] > o2[col-1])
                    return 1;
                else if(o1[col-1] < o2[col-1])
                    return -1;
                else
                    if(o1[0] < o2[0])
                        return 1;
                    else
                        return -1;
            }
        });
        //System.out.println(Arrays.deepToString(data));

        int[] array = new int[row_end - row_begin + 1];
        int index = 0;
        for(int i = row_begin-1; i <= row_end - 1; i++){
            int sum = 0;
            for(int num : data[i]){
                sum += num % (i+1);
            }
            array[index] = sum;
            index++;
        }
        //System.out.println(Arrays.toString(array));
        answer = array[0];
        for(int i = 1; i < array.length; i++){
            answer = answer ^ array[i];
        }
        return answer;
    }
}