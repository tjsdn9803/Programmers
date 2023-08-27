def solution(foods):
    answer = ''
    for i,food in enumerate(foods):
        answer += str(i)*(food//2)
    reverse = answer[::-1]
    return answer + '0' + reverse