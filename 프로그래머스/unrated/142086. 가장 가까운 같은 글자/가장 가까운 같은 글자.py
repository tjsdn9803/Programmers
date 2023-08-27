def solution(s):
    answer = []
    dic = dict()
    for i, alphabet in enumerate(s):
        if(alphabet not in dic):
            answer.append(-1)
        else:
            answer.append(i-dic[alphabet])
        dic[alphabet] = i
    return answer