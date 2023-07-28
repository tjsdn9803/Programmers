import java.util.*;

class Solution {
    boolean[] check;
    List<Integer> sizeList = new ArrayList<>();
    public int solution(int[] cards) {
        int answer = 0;
        check = new boolean[cards.length+1];
        int[] newCards = new int[cards.length+1];
        for (int i = 0 ; i < cards.length; i++){
            newCards[i+1] = cards[i];
        }
        for(int i = 1 ; i < newCards.length; i++){
            if(check[i] != true){
                openBox(newCards, i, 0);
            }
        }
        if (sizeList.size() == 1){
            return 0;
        }
        Collections.sort(sizeList, Collections.reverseOrder());

        return sizeList.get(0) * sizeList.get(1);
    }
    public void openBox(int[] newCards, int index, int size){
        if(check[index]) {
            sizeList.add(size);
            return;
        }
        check[index] = true;
        int nextIndex = newCards[index];

        openBox(newCards, nextIndex, size+1);
    }


}