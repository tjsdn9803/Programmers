def solution(k, m, score):
    answer = 0
    score = sorted(score)
    for i in range(len(score) // m):
        answer += score[-m * (i+1)]*m
    return answer