function solution(n) {
    var r = Math.sqrt(n);
    if(r != NaN && r%1 == 0){
        return Math.pow(r+1,2);
    }else{
        return -1;
    }
}