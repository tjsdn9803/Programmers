import math

def solution(brown, yellow):
    answer = [0,0]
    if(yellow == 1):
        return [3,3]
    for i in range(1, math.ceil(yellow**0.5)+1):
        if(yellow % i == 0):
            answer[0] = yellow // i + 2
            answer[1] = i + 2
            print(answer)
            if(brown == answer[0] * answer[1] - yellow):
                return answer
    return answer