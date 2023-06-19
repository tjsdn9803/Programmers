import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        ArrayList<String> part = new ArrayList<>();
        ArrayList<String> comp = new ArrayList<>();
        for(String p : participant){
            part.add(p);
        }
        for(String c : completion){
            comp.add(c);
        }
        Collections.sort(part);
        Collections.sort(comp);
        
        int i = 0;
        while(i < comp.size()){
            if(part.get(i).equals(comp.get(i)) == false){
                return part.get(i);
            }
            i++;
        }
        return part.get(part.size() - 1);
    }
}