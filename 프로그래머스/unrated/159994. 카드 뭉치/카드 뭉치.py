def solution(cards1, cards2, goal):
    answer = "Yes"
    idx1 = 0
    idx2 = 0
    for w in goal:
        if(w == cards1[idx1]):
            idx1 = min(idx1 + 1, len(cards1)-1)
        elif(w == cards2[idx2]):
            idx2 = min(idx2 + 1, len(cards2)-1)
        else:
            return "No"
            
    return answer