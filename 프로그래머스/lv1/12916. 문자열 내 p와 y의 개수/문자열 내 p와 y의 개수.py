def solution(s):
    answer = 0
    for alphabet in s:
        if(alphabet == "p" or alphabet == "P"):
            answer += 1
        if(alphabet == "y" or alphabet == "Y"):
            answer -= 1
    
    if(answer == 0):
        return True
    else:
        return False