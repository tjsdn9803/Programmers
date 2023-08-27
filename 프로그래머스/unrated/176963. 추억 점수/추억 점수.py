def solution(name, yearning, photo):
    answer = []
    dic = dict()
    for person, grade in zip(name, yearning):
        dic[person] = grade
    for i in photo:
        num = 0
        for j in i:
            if(j in dic):
                num += dic[j]
        answer.append(num)
    return answer