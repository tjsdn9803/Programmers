def solution(k, score):
    answer = []
    honor = []
    for i in score:
        honor.append(i)
        honor.sort(reverse=True)
        if(len(honor) < k):
            answer.append(honor[-1])
        else:
            answer.append(honor[k-1])
    return answer