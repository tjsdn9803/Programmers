def solution(n):
    answer = ""

    while n >= 1:
        remainder = n % 3
        answer += str(remainder)
        n = n // 3


    return int(answer, 3)