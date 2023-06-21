class Solution {
    public String solution(String new_id) {
        String answer = "";
        answer = first(new_id);
        answer = second(answer);
        answer = third(answer);
        answer = fourth(answer);
        answer = fifth(answer);
        answer = sixth(answer);
        answer = seventh(answer);
        return answer;
    }
    public String first(String new_id){
        return new_id.toLowerCase();
    }
    public String second(String new_id){
        return new_id.replaceAll("[^a-z0-9-_.]","");
        
    }
    public String third(String new_id){
        while (new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }
        return new_id;
    }
    public String fourth(String new_id){
        if(new_id.length() > 0){
            if(new_id.charAt(0) == '.'){
                new_id = new_id.substring(1);
            }
        }
        if(new_id.length() > 0){
            if(new_id.charAt(new_id.length() - 1) == '.'){
                new_id = new_id.substring(0,new_id.length() - 1);
            }
        }
        
        return new_id;
    }
    public String fifth(String new_id){
        if(new_id.length() == 0){
            return "a";
        }
        return new_id;
    }
    public String sixth(String new_id){
        if(new_id.length() >= 16){
            new_id = new_id.substring(0,15);
        }
        if(new_id.charAt(new_id.length() - 1) == '.'){
            new_id = new_id.substring(0,new_id.length() - 1);
        }
        return new_id;
    }
    public String seventh(String new_id){
        StringBuilder sb = new StringBuilder(new_id);
        if(sb.length() <= 2){
            char c = sb.charAt(sb.length() - 1);
            while(sb.length() < 3){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}